public class Uni5Exe22 {
    public static void main(String[] args) {
        double salario = 2000;
        double aumento = 0.015;

        for (int ano = 1996; ano <= 2025; ano++) {
            salario += salario * aumento;
            aumento *= 2;
        }

        // Me deixou um pouco confuso o valor final...
        System.out.printf("O salario atual em 2025 e: R$ %.2f%n", salario);
    }
}

/*
---------------------------------------------------
Teste de Mesa:
Entrada:
Valores fixos

Saída:
O salario atual em 2025 e: R$ 1043357744745931000000000000000000000000000000000000000000000000000000000000000000000000,00
---------------------------------------------------
*/
