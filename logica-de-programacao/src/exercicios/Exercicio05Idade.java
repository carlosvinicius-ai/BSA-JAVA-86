package exercicios;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio05Idade {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Para trazer a data de hoje
        LocalDate data = LocalDate.now();

        int anoNascimento, anoAtual, idade;

        System.out.print("Digite o ano que você nasceu: ");
        anoNascimento = sc.nextInt();

        // Para trazer o ano de hoje
        anoAtual = LocalDate.now().getYear();

        idade = anoAtual - anoNascimento;

        System.out.printf("Com a data atual %s você tem %d anos",data, idade);



    }

}
