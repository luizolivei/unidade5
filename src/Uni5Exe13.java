import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int reabastecimentos = scanner.nextInt();
        double totalQuilometros = 0.0;
        double totalCombustivel = 0.0;

        for (int parada = 1; parada <= reabastecimentos; parada++) {
            double quilometros = scanner.nextDouble();
            double combustivel = scanner.nextDouble();
            double eficiencia = quilometros / combustivel;
            System.out.printf("Parada %d: %.2f km por litro%n", parada, eficiencia);
            totalQuilometros += quilometros;
            totalCombustivel += combustivel;
        }

        if (totalCombustivel > 0) {
            double media = totalQuilometros / totalCombustivel;
            System.out.printf("Quilometragem media obtida por litro: %.2f%n", media);
        } else {
            System.out.println("Quilometragem media obtida por litro: 0.00");
        }

        scanner.close();
    }
}
// Teste de mesa 1: 3 paradas 120/10 150/15 200/20 medias 12 10 10 e geral 10.67
// Teste de mesa 2: 1 parada 100/5 media parada 20 e geral 20
// Teste de mesa 3: 2 paradas 0/5 e 200/10 media parada 0 e 20 geral 10
