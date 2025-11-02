import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaAlturas = 0.0;

        for (int i = 0; i < 20; i++) {
            double altura = scanner.nextDouble();
            somaAlturas += altura;
        }

        double media = somaAlturas / 20.0;
        System.out.printf("A media das alturas e: %.2f%n", media);

        scanner.close();
    }
}
// Teste de mesa 1: alturas todas 1.80 média=1.80
// Teste de mesa 2: alturas 1.60 e 1.80 alternadas média=1.70
// Teste de mesa 3: alturas 2.00 todas média=2.00
