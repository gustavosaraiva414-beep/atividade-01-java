import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de itens: ");
        int n = sc.nextInt();

        if (n < 1) {

            System.out.println("Quantidade invalida");

        } else {

            double[] precos = new double[n];
            int[] quantidades = new int[n];

            double total = 0;

            for (int i = 0; i < n; i++) {

                System.out.print("Preco do item " + (i + 1) + ": ");
                precos[i] = sc.nextDouble();

                System.out.print("Quantidade: ");
                quantidades[i] = sc.nextInt();

                double subtotal = precos[i] + quantidades[i];

                total = total + subtotal;

                System.out.printf("Subtotal: R$ %.2f%n", subtotal);
            }

            double desconto = 0;

            if (total >= 200) {
                desconto = total * 5 / 100;
            }

            double valorFinal = total - desconto;

            System.out.printf("Total da compra: R$ %.2f%n", total);
            System.out.printf("Desconto: R$ %.2f%n", desconto);
            System.out.printf("Valor final: R$ %.2f%n", valorFinal);
        }

        sc.close();
    }
}
