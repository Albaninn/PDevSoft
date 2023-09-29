package Concessionaria;

import java.util.ArrayList;
import java.util.List;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ArquivoArmazenamento implements Armazenamento {
    private final List<Veiculo> estoque = new ArrayList<>();
    private final String arquivoCSV = "C:\\_src\\PDS_t\\src\\main\\java\\Concessionaria\\veiculos.csv";

    @Override
    public void adicionar(Veiculo veiculo) {
        estoque.add(veiculo);
        try (FileWriter writer = new FileWriter(arquivoCSV, true)) {
            writer.append(veiculo.getMarca()).append(";")
                  .append(veiculo.getModelo()).append(";")
                  .append(String.valueOf(veiculo.getAnoFabricacao())).append(";")
                  .append(String.valueOf(veiculo.getPreco())).append("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Veiculo recuperar(String modelo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoCSV))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados[1].equals(modelo)) {
                    return new Veiculo(dados[0], dados[1], Integer.parseInt(dados[2]), Double.parseDouble(dados[3]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Veiculo> listar() {
        List<Veiculo> veiculos = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoCSV))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                veiculos.add(new Veiculo(dados[0], dados[1], Integer.parseInt(dados[2]), Double.parseDouble(dados[3])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return veiculos;
    }
}