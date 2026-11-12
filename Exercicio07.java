import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = {"Ana", "Maria", "Julia", "Joao", "Pedro", "Lucas"};

        double[] salarios = new double[6];

        double soma = 0;
        double maior = 0;
        double menor = 0;

        for (int i = 0; i < salarios.length; i++) {

            System.out.print("Digite o salario de " + nomes[i] + ": ");
            salarios[i] = sc.nextDouble();

            soma = soma + salarios[i];

            if (i == 0) {
                maior = salarios[i];
                menor = salarios[i];
            }

            if (salarios[i] > maior) {
                maior = salarios[i];
            }

            if (salarios[i] < menor) {
                menor = salarios[i];
            }
        }

        double media = soma / salarios.length;
        int acima = 0;

        for (int i = 0; i < salarios.length; i++) {

            if (salarios[i] > media) {
                acima++;
            }
        }

        System.out.printf("Maior salario: R$ %.2f%n", maior);
        System.out.printf("Menor salario: R$ %.2f%n", menor);
        System.out.printf("Media salarial: R$ %.2f%n", media);
        System.out.println("Funcionarios acima da media: " + acima);

        sc.close();
    }
}
