package com.santander.test;

import com.santander.test.entidades.Pessoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanPessoa = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[5];

        double imc = 0.0;

        final double MIN_IMC = 18.5;
        final double MAX_IMC = 25.0;

        double abaixoIMC = 0.0;
        double acimaIMC = 0.0;

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();

            System.out.print("Digite o nome: ");
            pessoas[i].setNome(scanPessoa.next());

            System.out.print("Digite a altura: ");
            pessoas[i].setAltura(Double.parseDouble(scanPessoa.next()));

            System.out.print("Digite o peso: ");
            pessoas[i].setPeso(Double.parseDouble(scanPessoa.next()));

            imc = pessoas[i].getPeso() / Math.pow(pessoas[i].getAltura(), 2);

            pessoas[i].setImc(imc);

        }
        System.out.println("\n Dados: \n -----------------------");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.println(pessoas[i].getNome() + " - " + pessoas[i].getPeso() + " - " + pessoas[i].getImc());

        }

        ArrayList<Double> acimaPeso = new ArrayList<>();
        ArrayList<Double> abaixoPeso = new ArrayList<>();

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getImc() < MIN_IMC) {
                abaixoPeso.add(pessoa.getImc());
            } else if (pessoa.getImc() > MAX_IMC) {
                acimaPeso.add(pessoa.getImc());
            }
        }

        System.out.println("\nAbaixo do Peso: " + abaixoPeso);
        System.out.println("Acima do Peso: " + acimaPeso);


    }
}
