import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dia do vencimento: ");
        int diaVencimento = scanner.nextInt();

        System.out.print("Dia do pagamento: ");
        int diaPagamento = scanner.nextInt();

        System.out.print("Valor da prestação: ");
        double valorPrestacao = scanner.nextDouble();

        double valorFinal;
        int diasAtraso = diaPagamento - diaVencimento;

        if (diasAtraso <= 0) {
            valorFinal = valorPrestacao * 0.9;
            System.out.printf("O pagamento está em dia. O valor da prestação = R$%.2f%n", valorFinal);
        }
        else if (diasAtraso <= 5) {
            valorFinal = valorPrestacao;
            System.out.printf("O pagamento está em dia. O valor da prestação = R$%.2f%n", valorFinal);
        }
        else {
            valorFinal = valorPrestacao * (1 + 0.02 * diasAtraso);
            System.out.printf("O pagamento está atrasado. Multa de 2%% por dia de atraso. Valor da prestação = R$%.2f%n", valorFinal);
        }

        scanner.close();
    }
}

/*
Teste de Mesa 1:
Entrada:
diaVencimento = 10
diaPagamento = 9
valorPrestacao = 100.00

Passo a passo:
diasAtraso = 9 - 10 = -1

diasAtraso <= 0 → true
valorFinal = 100 * 0.9 = 90.00
Imprime: "O pagamento está em dia. O valor da prestação = R$90.00"

Saída esperada:
O pagamento está em dia. O valor da prestação = R$90.00

---------------------------------------------------

Teste de Mesa 2:
Entrada:
diaVencimento = 10
diaPagamento = 12
valorPrestacao = 100.00

Passo a passo:
diasAtraso = 12 - 10 = 2

diasAtraso <= 0 → false
diasAtraso <= 5 → 2 <= 5 → true
valorFinal = 100.00
Imprime: "O pagamento está em dia. O valor da prestação = R$100.00"

Saída esperada:
O pagamento está em dia. O valor da prestação = R$100.00

---------------------------------------------------

Teste de Mesa 3:
Entrada:
diaVencimento = 10
diaPagamento = 18
valorPrestacao = 100.00

Passo a passo:
diasAtraso = 18 - 10 = 8

diasAtraso <= 0 → false
diasAtraso <= 5 → 8 <= 5 → false
valorFinal = 100 * (1 + 0.02 * 8) = 100 * 1.16 = 116.00
Imprime: "O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$116.00"

Saída esperada:
O pagamento está atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$116.00
*/
