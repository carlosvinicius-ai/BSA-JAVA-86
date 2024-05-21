package exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 * Escreva um programa de cadastro de aluno, onde ele irá colocar seu nome, sua idade, seu gênero, seu curso e gere um RA aleatório onde o primeiro item é a primeira letra do seu nome e depois são números aleatórios.
 *
 * Mostre depois para o usuário seu nome todo em letra maiúscula, diga quantos caracteres tem o seu nome, mostre todas as outras informações que ele cadastrou e mostre o nome do curso todo em letra minúscula.
 * */

public class Exercicio06Cadastro {

    public static void main(String[] args) {

        Random rd = new Random(); // para criar uma instancia para número aleatório
        Scanner sc = new Scanner(System.in); // Para digitar os dados

        String nome, curso, RA;
        byte idade;
        char genero;

        System.out.print("Digite o seu nome para cadastro: ");
        nome = sc.nextLine();

        System.out.print("Digite a sua idade: ");
        idade = sc.nextByte();
        sc.nextLine(); // Criado para limpar os dados de entrada

        System.out.print("Digite o seu gênero: ");
        String texto = sc.nextLine();
        genero = texto.toUpperCase().charAt(0);

        System.out.print("Digite o seu curso: ");
        curso = sc.nextLine();
        // Utilizando o método charAt
//        RA =nome.charAt(0) + String.valueOf(rd.nextInt(100));

        // Utilizando o método substring
        RA = nome.substring(0,1) + rd.nextInt(100); // para gerar um número aletório e transformar em letra maiúscula

        System.out.printf("Seu nome é %s e ele possui %s letras, sua idade é %d seu gênero é %s %nVocê se inscreveu no curso de %s com o RA %s", nome.toUpperCase(), nome.length(), idade, genero, curso.toLowerCase(), RA);


        sc.close();
    }

}
