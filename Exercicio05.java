
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] frutas = {"Maçã", "Banana", "Uva", "Laranja", "Pera"};
        double[] precos = new double[5];
        double[] desconto = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o preço da " + frutas[i] + ": ");
            precos[i] = sc.nextDouble();

            desconto[i] = precos[i] - (precos[i] * 10 / 100);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(frutas[i]);
            System.out.printf("Preço original: R$ %.2f%n", precos[i]);
            System.out.printf("Preço com desconto: R$ %.2f%n", desconto[i]);
        }

        sc.close();
    }
}
