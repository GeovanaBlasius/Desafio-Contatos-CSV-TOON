package service;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CarregarCSV csv = new CarregarCSV();
        ArrayList<Contato> lista = csv.carregar("contatos.csv");

        System.out.println("Contatos do CSV");
        lista.forEach(System.out::println);

        ToonService toon = new ToonService();
        toon.salvarTOON(lista);

        ArrayList<Contato> listaToon = toon.carregarTOON("contatos.toon");

        System.out.println("\n Contatos do TOON ");
        listaToon.forEach(System.out::println);
    }
}
