package service;

import java.io.*;
import java.util.ArrayList;

public class CsvService {

    public void salvarCSV(ArrayList<Contato> lista) {
        try (PrintWriter writer = new PrintWriter("contatos.csv")) {

            writer.println("id;nome;email;telefone;nascimento");

            for (Contato c : lista) {
                writer.println(
                        c.getId() + ";" +
                                c.getNome() + ";" +
                                c.getEmail() + ";" +
                                c.getTelefone() + ";" +
                                c.getDataNascimento()
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Contato> carregarCSV() {

        ArrayList<Contato> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("contatos.csv"))) {

            String linha;
            br.readLine();

            while ((linha = br.readLine()) != null) {
                String[] p = linha.split(";");

                Contato c = new Contato(
                        Integer.parseInt(p[0]),
                        p[1], p[2], p[3], p[4]
                );

                lista.add(c);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
}
