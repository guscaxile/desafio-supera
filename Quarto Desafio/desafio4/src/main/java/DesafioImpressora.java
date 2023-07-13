import java.util.Scanner;

public class DesafioImpressora {

    public static String decifrarLinha(String linha) {
        int meio = linha.length() / 2;
        String metadeEsquerda = new StringBuilder(linha.substring(0, meio)).reverse().toString();
        String metadeDireita = new StringBuilder(linha.substring(meio)).reverse().toString();
        return metadeEsquerda + metadeDireita;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String linha = scanner.nextLine();
            String decifrada = decifrarLinha(linha);
            System.out.println(decifrada);
        }

        scanner.close();
    }
}
