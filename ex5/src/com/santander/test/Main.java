package com.santander.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int qtdNomes = 5;
        Scanner entrada = new Scanner(System.in);
        String[] listaNomes = new String[qtdNomes];
        String maiorNome = "";

        for (int i = 0; i < listaNomes.length; i++) {
            System.out.println("Escreva um nome:");
            listaNomes[i] = entrada.next();

            if (listaNomes[i].length() > maiorNome.length()){
                maiorNome = listaNomes[i];
            }
        }
        System.out.println("Lista de nomes:");
        for (int i = 0; i < listaNomes.length; i++) {
            System.out.println("| " + listaNomes[i]);
        }

        System.out.println("Maior nome: " + maiorNome);
    }
}
