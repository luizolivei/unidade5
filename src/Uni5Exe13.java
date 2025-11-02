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
/*
Teste de Mesa 1:
Entrada:
reabastecimentos = 3
paradas = [(120 km, 10 L), (150 km, 15 L), (200 km, 20 L)]

Passo a passo:
Parada 1 → eficiência = 120 / 10 = 12.00 → totalQuilometros = 120 → totalCombustivel = 10
Parada 2 → eficiência = 150 / 15 = 10.00 → acumulados: 270 km e 25 L
Parada 3 → eficiência = 200 / 20 = 10.00 → acumulados: 470 km e 45 L
Média geral = 470 / 45 ≈ 10.44

Saída:
Parada 1: 12.00 km por litro
Parada 2: 10.00 km por litro
Parada 3: 10.00 km por litro
Quilometragem media obtida por litro: 10.44

---------------------------------------------------

Teste de Mesa 2:
Entrada:
reabastecimentos = 1
parada = [(100 km, 5 L)]

Passo a passo:
Parada única → eficiência = 20.00 → totalQuilometros = 100 → totalCombustivel = 5
Média geral = 100 / 5 = 20.00

Saída:
Parada 1: 20.00 km por litro
Quilometragem media obtida por litro: 20.00

---------------------------------------------------

Teste de Mesa 3:
Entrada:
reabastecimentos = 2
paradas = [(0 km, 5 L), (200 km, 10 L)]

Passo a passo:
Parada 1 → eficiência = 0 / 5 = 0.00 → totais: 0 km, 5 L
Parada 2 → eficiência = 200 / 10 = 20.00 → totais: 200 km, 15 L
Média geral = 200 / 15 ≈ 13.33

Saída:
Parada 1: 0.00 km por litro
Parada 2: 20.00 km por litro
Quilometragem media obtida por litro: 13.33
*/
