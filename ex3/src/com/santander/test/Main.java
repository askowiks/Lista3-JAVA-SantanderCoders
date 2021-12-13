package com.santander.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int qtdNumeros = 5;
        int i = 0;
        int[] numeros = new int[qtdNumeros];


        for (i = 0; i < qtdNumeros; i++){
            System.out.println("Digite um número:");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("Números digitados: ");

        for (i = 0; i < qtdNumeros; i++){
            System.out.print(numeros[i] + " | ");
        }

        ArrayList<Integer> numerosImpares = new ArrayList<>();
        ArrayList<Integer> numerosPares = new ArrayList<>();

        for (int valor : numeros) {

            if (valor % 2 == 0) {
                numerosPares.add(valor);
            }else {
                numerosImpares.add(valor);
            }

        }

        System.out.println("\nNúmeros Ímpare: " + numerosImpares);
        System.out.println("Números Pares: " + numerosPares);

    }
}
