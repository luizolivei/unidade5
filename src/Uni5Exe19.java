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
/*
Teste de Mesa 1:
Entrada:
600.00, 400.00, 200.00, 750.00, 0

Passo a passo:
Compra 1 → valor > 500 → desconto = 20% → pagar = 600 - 120 = 480 → totalRecebido = 480
Compra 2 → valor <= 500 → desconto = 15% → pagar = 400 - 60 = 340 → totalRecebido = 820
Compra 3 → pagar = 200 - 30 = 170 → totalRecebido = 990
Compra 4 → pagar = 750 - 150 = 600 → totalRecebido = 1590
Entrada 0 encerra

Saída:
Valor a pagar: R$480.00
Valor a pagar: R$340.00
Valor a pagar: R$170.00
Valor a pagar: R$600.00
O valor total recebido foi de R$1590.00

---------------------------------------------------

Teste de Mesa 2:
Entrada:
300.00, 0

Passo a passo:
Compra única → desconto = 45.00 → pagar = 255.00 → totalRecebido = 255.00
Entrada 0 encerra

Saída:
Valor a pagar: R$255.00
O valor total recebido foi de R$255.00

---------------------------------------------------

Teste de Mesa 3:
Entrada:
0

Passo a passo:
Laço é encerrado imediatamente → totalRecebido permanece 0

Saída:
O valor total recebido foi de R$0.00
*/
