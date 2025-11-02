import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }
        }

        scanner.close();
    }
}
// Teste de mesa 1: entradas = 10 63 4 ... saída = Par, Ímpar, Par, ...
// Teste de mesa 2: entradas = 2 repetidos 20 vezes saída = sempre Par
// Teste de mesa 3: entradas = 1 repetidos 20 vezes saída = sempre Ímpar
