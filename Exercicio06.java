import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double valor;
        double taxa;

        System.out.print("Digite o valor do emprestimo: ");
        valor = sc.nextDouble();

        System.out.print("Digite a taxa mensal: ");
        taxa = sc.nextDouble();

        double[] meses = new double[12];

        for (int i = 0; i < meses.length; i++) {

            meses[i] = valor + valor * taxa / 100 * (i + 1);

            System.out.printf("Mes %d: R$ %.2f%n", i + 1, meses[i]);
        }

        sc.close();
    }
}
