package com.santander.test;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = entrada.next();
        String[] arrayPalavra = palavra.split("");
        String[] chars = new String[arrayPalavra.length];

        for (int i = 0; i < chars.length; i++) {

            chars[i] = arrayPalavra[i];

            if (i % 2 == 0){
                chars[i] = arrayPalavra[i].toUpperCase(Locale.ROOT);
            }
        }

        String palavraFinal = String.join("", chars);

        System.out.println(palavraFinal);

    }
}
