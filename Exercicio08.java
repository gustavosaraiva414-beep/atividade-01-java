
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = {
            "Ana", "Beatriz", "Carla", "Fernanda", "Juliana",
            "Carlos", "Pedro", "Lucas", "João", "Marcos"
        };

        double[] notas = new double[10];

        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota de " + nomes[i] + ": ");
            notas[i] = sc.nextDouble();

            if (notas[i] >= 6) {
                aprovados++;
            } else if (notas[i] >= 4) {
                recuperacao++;
            } else {
                reprovados++;
            }
        }

        System.out.println("Aprovados: " + aprovados);
        System.out.println("Em recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);

        sc.close();
    }
}
