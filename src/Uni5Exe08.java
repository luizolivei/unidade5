import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        int menorNegativo = Integer.MAX_VALUE;
        boolean temNegativo = false;
        int somaPositivos = 0;
        int quantidadePositivos = 0;

        for (int i = 0; i < quantidade; i++) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                if (!temNegativo || numero < menorNegativo) {
                    menorNegativo = numero;
                }
                temNegativo = true;
            } else if (numero > 0) {
                somaPositivos += numero;
                quantidadePositivos++;
            }
        }

        if (temNegativo) {
            System.out.println("Menor valor negativo: " + menorNegativo);
        } else {
            System.out.println("Menor valor negativo: nenhum valor negativo informado");
        }

        if (quantidadePositivos > 0) {
            double mediaPositivos = (double) somaPositivos / quantidadePositivos;
            System.out.printf("Media dos numeros positivos: %.2f%n", mediaPositivos);
        } else {
            System.out.println("Media dos numeros positivos: 0.00");
        }

        scanner.close();
    }
}
// Teste de mesa 1: entrada 5 valores 2 -1 -8 4 3 menor=-8 mediaPositivos=3.0
// Teste de mesa 2: entrada 3 valores -2 -3 -1 menor=-3 mediaPositivos=0
// Teste de mesa 3: entrada 4 valores 1 2 3 4 sem negativos menor mensagem e media=2.5
