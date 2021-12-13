package com.santander.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String [] carrinho = new String[5];
        Scanner entrada = new Scanner(System.in);

        for (int indice = 0; indice <= carrinho.length - 1; indice++){
            System.out.println("Escreva o nome da fruta para adicionar ao carrinho:");
            carrinho[indice] = entrada.next();
        }
        for (int indice = 0; indice <= carrinho.length - 1; indice++){
            System.out.print(" | " + carrinho[indice]);
        }
    }
}
