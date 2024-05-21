package exercicios;

import java.util.Scanner;

public class Exercicio07Media {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome, RA;
        double nota1, nota2, nota3, media;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.printf("%s por favor, digite o seu RA: ", nome);
        RA = sc.nextLine();

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota3 = sc.nextDouble();

        media = (nota1 + nota2 + nota3) / 3.0;

        System.out.printf("Querido Aluno %s do RA %s sua média foi igual a %.2f. %nObrigado pela atenção!", nome, RA, media);

    }

}
