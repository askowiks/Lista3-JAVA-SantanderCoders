package com.santander.test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int qtdPessoas = 5;
        String[][] pessoas = new String[qtdPessoas][2];
        int idade = 0;
        int linha = 0;
        int coluna = 0;
        String[] maisNovo = new String[];
        String[] maisVelho = new String[];
        int soma = 0;

        for (linha = 0; linha < qtdPessoas; linha++){

            System.out.println("Escreva o nome da pessoa:");
            pessoas[linha][0] = entrada.next();

            System.out.println("Escreva a idade da pessoa:");
            idade = entrada.nextInt();
            pessoas[linha][1] = String.valueOf(idade);

            soma += idade;

            if (idade > maisVelho) {

            }

        }

        System.out.println("\n" + Arrays.deepToString(pessoas));
    }

}
