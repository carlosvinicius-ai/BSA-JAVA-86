package exercicios;

// pacote importado
import java.util.Locale;

/**
 * Crie um programa que subtraia 2 números decimais e mostre o resultado para o usuário final
 */

// por padrão criamos a classe com a primeira letra maiúscula
public class Exercicio01Subtrair {
    public static void main(String[] args) {


//        Locale é para mudar a localização da informação
        Locale.setDefault(Locale.US);

/*        Declarando as variáveis

          Você pode declarar a variável e depois incluir seu valor, ou já incluir o valor */
        double x , y, subtrair;

        x = 35.5;
        y = 6.8;

        subtrair = x - y;

//          Existe um atalho chamado sout, para escrever mais rapidamente
        System.out.println("A subtração de " + x + " - " + y + " é igual a " + subtrair);
    }
}
