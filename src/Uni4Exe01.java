import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com as horas trabalhas no mês:\n");

        float horasMes = scanner.nextFloat();

        System.out.print("Entre com o valor pago por hora:\n");
        float horasValor = scanner.nextFloat();

        float salarioTotal = horasMes * horasValor;

        float salarioExtra = 0;
        if (horasMes > 160) {
            salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }

        System.out.println("O salário total é: " + salarioTotal); 

        scanner.close();
    }
}

/*
Teste de Mesa 1:
Entrada:
horasMes = 150
horasValor = 20

Passo a passo:
salarioTotal = 150 * 20 = 3000
horasMes <= 160, então não há horas extras
salarioExtra = 0
salarioTotal final = 3000

Saída esperada:
O salário total é: 3000.0

---------------------------------------------------

Teste de Mesa 2:
Entrada:
horasMes = 170
horasValor = 25

Passo a passo:
salarioTotal = 170 * 25 = 4250
horasMes > 160, então calcular horas extras:
salarioExtra = (170 - 160) * (25 / 2) = 10 * 12.5 = 125
salarioTotal final = 4250 + 125 = 4375

Saída esperada:
O salário total é: 4375.0

---------------------------------------------------

Teste de Mesa 3:
Entrada:
horasMes = 160
horasValor = 30

Passo a passo:
salarioTotal = 160 * 30 = 4800
horasMes = 160, não há horas extras
salarioExtra = 0
salarioTotal final = 4800

Saída esperada:
O salário total é: 4800.0
*/
