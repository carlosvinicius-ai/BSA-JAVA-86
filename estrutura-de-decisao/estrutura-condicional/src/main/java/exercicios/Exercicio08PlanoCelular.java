package exercicios;

import java.util.Scanner;

/**
 * Uma operadora de telefonia cobra R$ 79.30 por um plano básico que dá direito a 100 minutos de telefone.
 * Cada minuto que exceder a franquia de 100 minutos custa R$ 2.30.
 * Fazer um programa para ler a quantidade de minutos que uma pessoa consumiu,
 * daí mostrar o valor a ser pago.
 * */

public class Exercicio08PlanoCelular {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Criando a instância

        // criando as váriaveis
        double conta = 79.30;
        int minutos;

        System.out.print("Digite quantos minutos você falou no telefone: ");
        minutos = sc.nextInt();

        // verificando se os minutos são maior que 100
        if(minutos > 100){
            // utilizando operador de atribuição acumulativa
            conta += (minutos - 100) * 2.30;
        }

        System.out.printf("O valor da conta: R$%.2f", conta);


        sc.close();

    }
}
