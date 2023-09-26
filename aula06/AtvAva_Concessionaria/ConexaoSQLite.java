import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class ConexaoSQLite {
    private static final String URL = "jdbc:sqlite:veiculos.db";
    private static Connection conexao;

    private ConexaoSQLite() {}

    public static Connection getConexao() {
        if (conexao == null) {
            try {
                conexao = DriverManager.getConnection(URL);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conexao;
    }
}