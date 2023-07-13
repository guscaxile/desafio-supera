import java.util.Scanner;

public class TrocoNotaMoedas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um valor: ");
        double valor = scanner.nextDouble();

        System.out.println("NOTAS:");
        int[] notas = {100, 50, 20, 10, 5, 2};
        for (int nota : notas) {
            int quantidadeNotas = (int) (valor / nota);
            System.out.printf("%d nota(s) de R$ %.2f%n", quantidadeNotas, nota * 1.0);
            valor -= quantidadeNotas * nota;
        }

        System.out.println("MOEDAS:");
        double[] moedas = {1, 0.50, 0.25, 0.10, 0.05, 0.01};
        for (double moeda : moedas) {
            int quantidadeMoedas = (int) (valor / moeda);
            System.out.printf("%d moeda(s) de R$ %.2f%n", quantidadeMoedas, moeda);
            valor -= quantidadeMoedas * moeda;
        }
    }
}
