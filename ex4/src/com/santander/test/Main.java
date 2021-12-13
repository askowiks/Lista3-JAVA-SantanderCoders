package com.santander.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int qtdNumeros = 5;
        int[] numeros = new int[qtdNumeros];

        int menorNum = 0;
        int maiorNum = 0;

        int soma = 0;
        double media = 0.0;

        for (int i = 0; i < numeros.length; i++){
            System.out.println("digite um numero");
            numeros[i] = entrada.nextInt();

            if (maiorNum == 0 && menorNum ==0) {
                menorNum = numeros[0];
                maiorNum = numeros[0];
            }

            if (numeros[i] > maiorNum){
                maiorNum = numeros[i];
            }

            if (numeros[i] < menorNum) {
                menorNum = numeros[i];
            }
            soma += numeros[i];

        }
        media = soma / qtdNumeros;

        System.out.println("Maior: " + maiorNum);
        System.out.println("Menor: " + menorNum);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

    }
}
