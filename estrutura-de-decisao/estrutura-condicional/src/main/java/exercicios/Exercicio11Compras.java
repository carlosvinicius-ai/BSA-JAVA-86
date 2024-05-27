package exercicios;

import java.util.Scanner;

/**
 * Usando a tabela de informações abaixo, crie um programa que multiplique o preço do item,
 * pela quantidade que o usuário desejar: (Você pode escolher os valores)
 *
 * CÓDIGO | ITEM
 * 1 | Mc Lanche Feliz
 * 15 | Panqueca
 * 32 | Waffle
 * 25 | Chocotone
 * 46 | Java Coffee
 * 2 | Wooper
 * */

public class Exercicio11Compras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escolha, quantidade;
        double valor;
        String item;

        // Criando a base para mostrar para o usuário
        System.out.println("||--------||------|| ----- ");
        System.out.println("|| Código || Item || Valor ");
        System.out.println("|| 1  || Mc Lanche Feliz || R$27,90");
        System.out.println("|| 15 || Panqueca        || R$10,55");
        System.out.println("|| 32 || Waffle          || R$8,99 ");
        System.out.println("|| 25 || Chocotone       || R$15,22");
        System.out.println("|| 46 || Java Coffe      || R$12,30");
        System.out.println("|| 2  || Whopper         || R$15,00");

        System.out.print("\nDigite a sua escolha: ");
        escolha = sc.nextInt();
        sc.nextLine();
        System.out.print("Digite a quantidade: ");
        quantidade = sc.nextInt();

        // fazendo a verificação do que o usuário digitou
        switch (escolha){

            case 1:
                valor = 27.90 * quantidade;
                item = "MC Lanche Feliz";
                break;

            case 15:
                valor = 10.55 * quantidade;
                item = "Panqueca";
                break;

            case 32:
                valor = 8.99 * quantidade;
                item = "Waffle";
                break;

            case 25:
                valor = 15.22 * quantidade;
                item = "Chocotone";
                break;

            case 46:
                valor = 12.30 * quantidade;
                item = "Java Coffe";
                break;

            case 2:
                valor = 15.00 * quantidade;
                item = "Whopper";
                break;

            default:
                valor = 0.0;
                item = "Inválido";
                break;


        }

        System.out.printf("O item %s comprando %d unidades, sairá por R$%.2f", item, quantidade, valor);

        sc.close();

    }

}
