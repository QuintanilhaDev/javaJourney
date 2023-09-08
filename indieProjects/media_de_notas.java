import java.util.Scanner;

public class CalculadoraMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Média de Notas");
        System.out.print("Quantas notas você deseja inserir? ");
        int quantidadeNotas = scanner.nextInt();

        double somaNotas = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / quantidadeNotas;

        System.out.println("A média das notas é: " + media);

        scanner.close();
    }
}
