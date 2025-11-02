import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double massaInicial = scanner.nextDouble();
        double massaAtual = massaInicial;
        int tempo = 0;

        while (massaAtual >= 0.0005) {
            massaAtual /= 2.0;
            tempo += 50;
        }

        System.out.printf("Massa inicial: %.4f kg%n", massaInicial);
        System.out.printf("Massa final: %.6f kg%n", massaAtual);
        System.out.println("Tempo necessario: " + tempo + " segundos");

        scanner.close();
    }
}
// Teste de mesa 1: massa 1.0 kg reduz ate <0.0005 resultado tempo 650 segundos
// Teste de mesa 2: massa 0.0004 kg nao entra no loop tempo 0
// Teste de mesa 3: massa 0.5 kg tempo 50 massa final 0.25
