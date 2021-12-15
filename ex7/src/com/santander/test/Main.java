package com.santander.test;

import com.santander.test.entidades.Pessoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanPessoa = new Scanner(System.in);
        Pessoa[] pessoas = new Pessoa [5];



        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();

            System.out.print("Digite o nome: ");
            pessoas[i].setNome(scanPessoa.next());

            System.out.print("Digite a idade: ");
            pessoas[i].setIdade(scanPessoa.nextInt());
        }

        System.out.println("\nDADOS RECEBIDOS:");

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Nome: " + pessoas[i].getNome() + ", " + pessoas[i].getIdade() + " anos.");
        }

        int maiorIdade = pessoas[0].getIdade();
        int menorIdade = pessoas[0].getIdade();

        int somaIdade = 0;


        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < menorIdade){
                menorIdade = pessoas[i].getIdade();
            } else if (pessoas[i].getIdade() > maiorIdade){
                maiorIdade = pessoas[i].getIdade();
            }
            somaIdade += pessoas[i].getIdade();
        }
        float mediaIdade = (somaIdade / pessoas.length);

        System.out.println("----------------------------");

        System.out.println("Maior idade: " + maiorIdade + " anos.");
        System.out.println("Menor idade: " + menorIdade + " anos.");
        System.out.println("Média de idade: " + mediaIdade + " anos.");

    }

}
