package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CarregarCSV {

    public ArrayList<Contato> carregar(String caminho) {
        ArrayList<Contato> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;
            boolean primeiro = true;

            while ((linha = br.readLine()) != null) {

                if (linha.trim().isEmpty()) continue;

                if (primeiro) {
                    primeiro = false;
                    continue;
                }

                String[] campos = linha.split(";");

                int id = Integer.parseInt(campos[0].trim());
                String nome = campos[1].trim();
                String email = campos[2].trim();
                String telefone = campos[3].trim();
                String dataNascimento = campos[4].trim();

                lista.add(new Contato(id, nome, email, telefone, dataNascimento));
            }

        } catch (Exception e) {
            System.out.println("Erro ao carregar CSV: " + e.getMessage());
        }

        return lista;
    }
}
