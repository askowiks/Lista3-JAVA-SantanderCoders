package com.santander.test;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner palavraScanner = new Scanner(System.in);

        System.out.println("Digite uma palavra:");
        String palavra = palavraScanner.next();

        String[] arrayPalavra = palavra.split("");
        String[] palavraInvertida = new String[arrayPalavra.length];
        
        int indice = arrayPalavra.length - 1;
        int indiceI = 0;

        for (; indice >= 0; indice--){
            palavraInvertida[indiceI] = arrayPalavra[indice];

            indiceI++;
        }
        String palavraFinal = String.join("", palavraInvertida);

        System.out.println("Palavra: " + palavra);
        System.out.println("Palavra Invertida: " + palavraFinal);


    }
}
