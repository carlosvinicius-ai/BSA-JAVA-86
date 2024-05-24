package exercicios;

import java.util.Scanner;

/**
 * Escreva um programa que faça o cálculo de aluguel a ser pago ao alugar um carro, onde a cada dia que a pessoa ficar com o carro seja cobrado R$86,75 e a cada KM rodado seja cobrado R$1,23
 Depois mostre para o usuários as taxas e o valor que ele irá pagar
 */
public class Exercicio04Aluguel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double aluguelCobrado, KMCobrado;
        double diasComOCarro, KMRodados, aluguelAPagar;

        aluguelCobrado = 86.75;
        KMCobrado = 1.23;

        System.out.print("Digite quantos dias você ficou com o carro: ");
        diasComOCarro = sc.nextDouble();

        System.out.print("Digite quantos KM você andou com o carro: ");
        KMRodados = sc.nextDouble();

        aluguelAPagar = (diasComOCarro * aluguelCobrado) + (KMRodados * KMCobrado);

        System.out.printf("Você irá pagar para a empresa R$%.2f pelo aluguel do carro", aluguelAPagar);

        sc.close();

    }

}
