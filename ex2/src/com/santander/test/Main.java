package com.santander.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner palavraScanner = new Scanner(System.in);
        String palavra = palavraScanner.next();
        String[] arrayPalavra = new String[palavra.length()];

        for (int i = 0; i < palavra.length(); i++){
        arrayPalavra[i] = palavra[i];
        }


    }
}
