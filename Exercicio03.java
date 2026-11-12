import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String aluno = "Gustavo";
        double[] notas = new double[4];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota: ");
            notas[i] = sc.nextDouble();

            soma = soma + notas[i];
        }

        double media = soma / 5;

        System.out.printf("Aluno: %s%n", aluno);
        System.out.printf("Media: %.2f%n", media);

        if (media > 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        sc.close();
    }
}
