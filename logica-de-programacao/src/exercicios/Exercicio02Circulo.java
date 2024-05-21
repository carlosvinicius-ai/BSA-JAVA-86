package exercicios;
import java.util.Locale;
import java.util.Scanner;

/**
 * Crie um programa que calcule a área de um círculo:
 * fórmula: pi.r²
 * */

public class Exercicio02Circulo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
//        Scanner é utilizado para ler as informações do usuário
        Scanner sc = new Scanner(System.in);

//        final é utilizado para constante
        final double PI = 3.1415;
        double r, area;

        System.out.print("Digite o Raio para calcularmos a área: ");

//        nextDouble() é utilizado para ler um número double
        r = sc.nextDouble();


        area = PI * (r*r);

//        System.out.printf é para mostrar o print com formtação
        System.out.printf("A área do Circulo com raio %.1f é igual a %.1f", r, area);


        sc.close();
    }

}