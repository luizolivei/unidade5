import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalRecebido = 0.0;

        while (true) {
            double valorCompra = scanner.nextDouble();
            if (valorCompra == 0) {
                break;
            }
            double desconto;
            if (valorCompra > 500.0) {
                desconto = valorCompra * 0.2;
            } else {
                desconto = valorCompra * 0.15;
            }
            double totalPagar = valorCompra - desconto;
            totalRecebido += totalPagar;
            System.out.printf("Valor a pagar: R$%.2f%n", totalPagar);
        }

        System.out.printf("O valor total recebido foi de R$%.2f%n", totalRecebido);

        scanner.close();
    }
}
// Teste de mesa 1: compras 600 400 200 750 0 totais 480 340 170 600 soma 1590
// Teste de mesa 2: compra unica 300 desconto 45 total 255
// Teste de mesa 3: compra 0 inicial total recebido 0
