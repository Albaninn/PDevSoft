package Concessionaria;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class BancoDeDadosArmazenamento implements Armazenamento {

    public BancoDeDadosArmazenamento() {
        try (Connection conn = ConexaoMySQL.getInstance();Statement stmt = conn.createStatement()){
            stmt.execute("CREATE TABLE IF NOT EXISTS veiculos (marca TEXT, modelo TEXT PRIMARY KEY, anoFabricacao INTEGER, preco REAL)");
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void adicionar(Veiculo veiculo) {
        String sql = "INSERT INTO veiculos(marca, modelo, anoFabricacao, preco) VALUES(?, ?, ?, ?)";
        try(Connection conn = ConexaoMySQL.getInstance(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, veiculo.getMarca());
            pstmt.setString(2, veiculo.getModelo());
            pstmt.setInt(3, veiculo.getAnoFabricacao());
            pstmt.setDouble(4, veiculo.getPreco());
            pstmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Veiculo recuperar(String modelo) {
        String sql = "SELECT * FROM veiculos WHERE modelo = ?";
        try (Connection conn = ConexaoMySQL.getInstance(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, modelo);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Veiculo(rs.getString("marca"), rs.getString("modelo"), rs.getInt("anoFabricacao"), rs.getDouble("preco"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Veiculo> listar() {
        List<Veiculo> veiculos = new ArrayList<>();
        String sql = "SELECT * FROM veiculos";
        try (Connection conn = ConexaoMySQL.getInstance(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                veiculos.add(new Veiculo(rs.getString("marca"), rs.getString("modelo"), rs.getInt("anoFabricacao"), rs.getDouble("preco")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return veiculos;
    }
}