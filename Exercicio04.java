import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] produtos = {"Banana", "Maca", "Laranja", "Uva", "Melancia"};
        double[] precos = new double[5];
        double total = 0;

        for (int i = 0; i < produtos.length; i++) {

            System.out.print("Preco da " + produtos[i] + ": ");
            precos[i] = sc.nextDouble();

            total = total + precos[i];
        }

        System.out.println("\nProdutos:");

        for (int i = 0; i < produtos.length; i++) {
            System.out.printf("%s: R$ %.2f%n", produtos[i], precos[i]);
        }

        System.out.printf("Total da compra: R$ %.2f%n", total);

        sc.close();
    }
}
