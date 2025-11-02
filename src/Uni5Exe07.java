import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 0; i < quantidade; i++) {
            double numero = scanner.nextDouble();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.printf("Maior numero: %.2f%n", maior);
        System.out.printf("Menor numero: %.2f%n", menor);

        scanner.close();
    }
}
// Teste de mesa 1: n=3 valores 1.0 5.0 2.0 maior=5.0 menor=1.0
// Teste de mesa 2: n=1 valor 7.5 maior=7.5 menor=7.5
// Teste de mesa 3: n=4 valores -1 -5 -2 -3 maior=-1 menor=-5
