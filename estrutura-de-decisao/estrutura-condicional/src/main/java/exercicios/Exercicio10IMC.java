package exercicios;

import java.util.Scanner;

/**
 * Uma empresa fitness precisa calcular o IMC dos seus colaboradores para saber o que eles precisam colocar na alimentação deles,
 * para isso pediu para você seguir a tabela abaixo para padronização:
 * Fórmula para cálculo: peso / altura²*/

public class Exercicio10IMC {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;
        double peso, altura, IMC;

        System.out.print("Por favor informe seu nome: ");
        nome = sc.nextLine();

        System.out.printf("Olá %s, vamos calcular seu IMC \nInforme seu peso: ", nome);
        peso = sc.nextDouble();

        System.out.printf("Agora %s precisamos da sua altura: ", nome);
        altura = sc.nextDouble();


        //utilizando a biblioteca Math para elevar um número
        IMC = peso / Math.pow(altura, 2.0);

        System.out.printf("Obrigado por utilizar o programa, seu IMC é igual a %.1f e sua classificação é: \n", IMC);


        // verificando os valores para mostrar a classificação do usuário
        if (IMC < 18.5){
            System.out.println("\033[1mMAGREZA\033[0m");
        } else if(IMC > 18.5 && IMC < 24.9){
            System.out.println("\033[1;33mNORMAL\033[0m");
        } else if(IMC > 25 && IMC < 29.9){
            System.out.println("\033[1mSOBREPESO\033[0m");
        } else if(IMC > 30 && IMC < 34.9){
            System.out.println("\033[1mOBESIDADE GRAU 1\033[0m");
        } else if(IMC > 35 && IMC < 39.9){
            System.out.println("\033[1mOBESIDADE GRAU 2\033[0m");
        } else {
            System.out.println("\033[1mOBESIDADE GRAU 3\033[0m");
        }

        sc.close();

    }
}
