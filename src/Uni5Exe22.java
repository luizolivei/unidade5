import java.util.Scanner;

public class Uni5Exe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoAtual = scanner.nextInt();
        double salario = 2000.0;

        if (anoAtual >= 1996) {
            double percentual = 0.015;
            salario += salario * percentual;
            for (int ano = 1997; ano <= anoAtual; ano++) {
                percentual *= 2.0;
                salario += salario * percentual;
            }
        }

        System.out.printf("Salario em %d: R$%.2f%n", anoAtual, salario);

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
anoAtual = 1996

Passo a passo:
percentual inicial = 0.015
salario = 2000 + 2000 * 0.015 = 2030
O laço for não executa (inicia em 1997 > 1996)

Saída:
Salario em 1996: R$2030.00

---------------------------------------------------

Teste de Mesa 2:
Entrada:
anoAtual = 1997

Passo a passo:
Após ajuste de 1996 → salario = 2030
Laço ano = 1997 → percentual = 0.015 * 2 = 0.03 → salario = 2030 + 2030 * 0.03 = 2090.90

Saída:
Salario em 1997: R$2090.90

---------------------------------------------------

Teste de Mesa 3:
Entrada:
anoAtual = 1995

Passo a passo:
Condição anoAtual >= 1996 é falsa → salario permanece 2000

Saída:
Salario em 1995: R$2000.00
*/
