package exercicios;

import java.util.Scanner;

public class Exercicio09Data {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        String data;
        String resultado;

        System.out.print("Digite o dia da semana: ");
        data = sc.nextLine();

        try {

            int numero = Integer.parseInt(data);

            switch (numero) {

                case 1:
                    resultado = "Domingo";
                    break;

                case 2:
                    resultado = "Segunda";
                    break;

                case 3:
                    resultado = "Terça";
                    break;

                case 4:
                    resultado = "Quarta";
                    break;

                case 5:
                    resultado = "Quinta";
                    break;

                case 6:
                    resultado = "Sexta";
                    break;

                case 7:
                    resultado = "Sábado";
                    break;

                default:
                    resultado = "Valor Inválido";
                    break;

            }

            System.out.printf("Hoje é %s, boa semana", resultado);

        } catch (NumberFormatException e) {

            if (data.contains("Domingo")){

                resultado = "1";

            } else {
                resultado = "Valor Inválido";
            }


            System.out.printf("Hoje é o %sº da semana, boa semana", resultado);

        }



        sc.close();

    }

}
