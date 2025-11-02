import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] canais = {4, 5, 9, 12};
        int[] totalPorCanal = new int[canais.length];
        int totalPessoas = 0;

        while (true) {
            int canal = scanner.nextInt();
            if (canal == 0) {
                break;
            }
            int pessoas = scanner.nextInt();
            boolean canalValido = false;
            for (int i = 0; i < canais.length; i++) {
                if (canais[i] == canal) {
                    totalPorCanal[i] += pessoas;
                    canalValido = true;
                    break;
                }
            }
            if (canalValido) {
                totalPessoas += pessoas;
            }
        }

        for (int i = 0; i < canais.length; i++) {
            if (totalPessoas > 0) {
                double percentual = (totalPorCanal[i] * 100.0) / totalPessoas;
                System.out.printf("Percentual de audiencia do canal %d: %.2f%%%n", canais[i], percentual);
            } else {
                System.out.printf("Percentual de audiencia do canal %d: 0.00%%%n", canais[i]);
            }
        }

        scanner.close();
    }
}
// Teste de mesa 1: canais 4 3, 5 2, 9 4, 12 1 total 10 percentuais 30 20 40 10
// Teste de mesa 2: apenas canal 4 com 5 pessoas resultado 100% para 4
// Teste de mesa 3: nenhum dado canal entrada 0 percentuais 0
