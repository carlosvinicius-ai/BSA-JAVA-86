package introducao;

public class EstruturaDeDecisao {

    public static void main(String[] args) {

        double n1, n2, n3, media;

        n1 = 8;
        n2 = 8;
        n3 = 8;

        media = (n1 + n2 + n3) / 3.0;


        if (media > 7.0){
            System.out.printf("Sua média foi %.1f e você foi APROVADO%n", media);
        } else if (media > 5.0 && media < 7.0) {
            System.out.printf("Sua média foi %.1f e você está de RECUPERAÇÃO%n", media);
        } else {
            System.out.printf("Sua média foi %.1f e você foi REPROVADO\n", media);
        }


        System.out.println("Muito obrigado por tirar a média conosco!");


    }

}
