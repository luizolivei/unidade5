import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = scanner.nextInt();
        int numeroAtual = 1;

        for (int linha = 1; linha <= linhas; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(numeroAtual + " ");
                numeroAtual++;
            }
            System.out.println();
        }

        scanner.close();
    }
}
// Teste de mesa 1: n=1 imprime "1"
// Teste de mesa 2: n=3 imprime linhas 1; 2 3; 4 5 6
// Teste de mesa 3: n=4 termina em 10
