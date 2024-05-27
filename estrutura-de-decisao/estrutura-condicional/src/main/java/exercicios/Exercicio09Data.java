package exercicios;

import java.util.Scanner;

/**
 * Precisando fazer tratamento de datas, uma empresa de celulares precisa que quando a pessoa entre com um número,
 * transforme ele no dia da semana referente:
 * 1 - Domingo
 * 2 - Segunda …
 * */

public class Exercicio09Data {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String data, dia;

        // Solicitando o dia da semana
        System.out.print("Digite o dia da semana de hoje: ");
        dia = sc.nextLine();

        // Tratamento de erro
        try{
            int numero = Integer.parseInt(dia); // vamos analisar para verificar caso o valor seja inteiro ou não

            // verificando qual número foi digitado
            switch (numero){
                case 1:
                    data = "Domingo";
                    // Para parar o switch
                    break;

                case 2:
                    data = "Segunda-Feira";
                    break;

                case 3:
                    data = "Terça-Feira";
                    break;

                case 4:
                    data = "Quarta-Feira";
                    break;

                case 5:
                    data = "Quinta-Feira";
                    break;

                case 6:
                    data = "Sexta-Feira";
                    break;

                case 7:
                    data = "Sábado";
                    break;

                default:
                    data = "Valor inválido";
                    break;
            }

            System.out.printf("Hoje é %s, boa semana\n", data);

        } catch (NumberFormatException e) {

            // caso de o erro iremos fazer os teste abaixo

            // contains verifica se o valor digitado contém no texto
            if (dia.contains("Domingo")){
                data = "1";
            } else if (dia.contains("Segunda")) {
                data = "2";
            } else if (dia.contains("Terça")) {
                data = "3";
            } else if (dia.contains("Quarta")) {
                data = "4";
            } else if (dia.contains("Quinta")) {
                data = "5";
            } else if (dia.contains("Sexta")) {
                data = "6";
            } else if (dia.contains("Sábado")) {
                data = "7";
            } else{
                data = "Valor Inválido";
            }


            System.out.printf("Hoje é o %sº dia da semana, boa semana\n", data);

        }


        /* verificando qual valor foi armazenado para mostrar outro texto ao usuário
         equals tem a mesma proposta do `==`*/

        if ((data == "2" || data == "Segunda-Feira") || (data == "3" || data == "Terça-Feira")){
            System.out.println("Mas que pena que ela está no inicio -_-");
        } else if ((data.equals("6") || data.equals("Sexta-Feira")) || (data.equals("7") || data.equals("Sábado"))){
            System.out.println("Ufaaa!! Estamos no fim!! ^-^");
        } else{
            System.out.println("Apenas mais um dia normal ;-;");
        }

        sc.close();

    }

}
