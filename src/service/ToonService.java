package service;

import java.io.*;
import java.util.ArrayList;

public class ToonService {

    public void salvarTOON(ArrayList<Contato> lista) {
        try (PrintWriter writer = new PrintWriter("contatos.toon")) {

            for (Contato c : lista) {
                writer.println("{");
                writer.println(" id: " + c.getId());
                writer.println(" nome: " + c.getNome());
                writer.println(" email: " + c.getEmail());
                writer.println(" telefone: " + c.getTelefone());
                writer.println(" nascimento: " + c.getDataNascimento());
                writer.println("}");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public ArrayList<Contato> carregarTOON(String caminho) {
        ArrayList<Contato> lista = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            String linha;

            int id = 0;
            String nome = "";
            String email = "";
            String telefone = "";
            String nascimento = "";

            while ((linha = br.readLine()) != null) {

                linha = linha.trim();

                if (linha.equals("{")) {
                    id = 0;
                    nome = "";
                    email = "";
                    telefone = "";
                    nascimento = "";
                } else if (linha.startsWith("id:")) {
                    id = Integer.parseInt(linha.replace("id:", "").trim());
                } else if (linha.startsWith("nome:")) {
                    nome = linha.replace("nome:", "").trim();
                } else if (linha.startsWith("email:")) {
                    email = linha.replace("email:", "").trim();
                } else if (linha.startsWith("telefone:")) {
                    telefone = linha.replace("telefone:", "").trim();
                } else if (linha.startsWith("nascimento:")) {
                    nascimento = linha.replace("nascimento:", "").trim();
                } else if (linha.equals("}")) {
                    lista.add(new Contato(id, nome, email, telefone, nascimento));
                }
            }

        } catch (Exception e) {
            System.out.println("Erro ao carregar TOON: " + e.getMessage());
        }

        return lista;
    }
}
