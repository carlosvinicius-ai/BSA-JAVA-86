package exercicios;


import java.util.Scanner;

/**
 * Escreva um programa que leia uma temperatura em Graus Celsius e a converta em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as fórmulas:
 * F = C * 1.8 + 32;
 * K = C + 273.15;
 * Re = C * 0.8;
 * Ra = C * 1.8 + 32 + 459.67;
 * Depois mostre a conversão para os usuários
 */

public class Exercicio03Conversor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double celsius, fahrenheit, kelvin, reaumur, rankine, rankine2;

        System.out.print("Entre com a temperatura atual: ");
        celsius = sc.nextDouble();


        // Fórmulas
        fahrenheit = celsius * 1.8 + 32;
        kelvin = celsius + 273.15;
        reaumur = celsius / 1.25;
        rankine = celsius * 1.8 + 491.67;
        rankine2 = (celsius + 273.15) * 9/5;


        System.out.printf("A temperatura %.1fº em Fahrenheit: %.1fº%n", celsius, fahrenheit);
        System.out.printf("A temperatura %.1fº em Kelvin: %.1fº\n", celsius, kelvin);
        System.out.printf("A temperatura %.1fº em Reaumur: %.1fº\n", celsius, reaumur);
        System.out.printf("A temperatura %.1fº em Rankine: %.1fº%n", celsius, rankine);
        System.out.printf("A temperatura %.1fº em Rankine (2ª fórmula): %.1fº\n", celsius, rankine2);

//        System.out.println("\\n"); para mostrar o \n escrito na linha

        sc.close();
    }

}
