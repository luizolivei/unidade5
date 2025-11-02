import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int valorAtual = numero;

        while (valorAtual > 1) {
            int fator = menorFatorPrimo(valorAtual);
            System.out.println(valorAtual + " " + fator);
            valorAtual /= fator;
        }

        System.out.println("1");

        scanner.close();
    }

    private static int menorFatorPrimo(int valor) {
        for (int i = 2; i <= valor; i++) {
            if (valor % i == 0) {
                return i;
            }
        }
        return valor;
    }
}
// Teste de mesa 1: numero 180 gera linhas 180 2, 90 2, 45 3, 15 3, 5 5, 1
// Teste de mesa 2: numero 13 gera 13 13 e 1
// Teste de mesa 3: numero 100 gera 100 2, 50 2, 25 5, 5 5, 1
