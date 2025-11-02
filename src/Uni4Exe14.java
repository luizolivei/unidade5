import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.print("Digite o mes: ");
        int mes = scanner.nextInt();

        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();
        scanner.close();

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 9 || mes == 10 || mes == 11 || mes == 12) {
                System.out.print("Valida");
                return;
            }

            if (mes != 2 && dia < 31) {
                System.out.print("Valida");
                return;
            }

            if (mes == 2 && dia < 29) {
                System.out.print("Valida");
                return;
            }

            if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
                System.out.print("Valida");
                return;
            }
        }

        System.out.print("Não valida");
        return;
    }
}

/*
Teste de Mesa 1:
Entrada:
dia = 15
mes = 6
ano = 2023

Passo a passo:
dia > 0 && dia < 32 → 15 > 0 && 15 < 32 → true
mes > 0 && mes < 13 → 6 > 0 && 6 < 13 → true
ano > 0 → 2023 > 0 → true

mes == 1 || 3 || 5 || 7 || 8 || 9 || 10 || 11 || 12 → 6 não está nessa lista → false
mes != 2 && dia < 31 → 6 != 2 && 15 < 31 → true
Imprime: "Valida"

Saída esperada:
Valida

---------------------------------------------------

Teste de Mesa 2:
Entrada:
dia = 29
mes = 2
ano = 2020

Passo a passo:
dia > 0 && dia < 32 → 29 → true
mes > 0 && mes < 13 → 2 → true
ano > 0 → true

mes == 1,3,...12 → 2 não está → false
mes != 2 && dia < 31 → 2 != 2 → false
mes == 2 && dia < 29 → 29 < 29 → false
dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)
29 == 29 && 2020 % 4 == 0 && !(2020 % 100 == 0 && 2020 % 400 != 0) → true
Imprime: "Valida"

Saída esperada:
Valida

---------------------------------------------------

Teste de Mesa 3:
Entrada:
dia = 31
mes = 4
ano = 2023

Passo a passo:
dia > 0 && dia < 32 → 31 → true
mes > 0 && mes < 13 → 4 → true
ano > 0 → true

mes == 1,3,5,... → 4 não está → false
mes != 2 && dia < 31 → 4 != 2 && 31 < 31 → 31 < 31 → false
mes == 2 && dia < 29 → 4 != 2 → false
dia == 29 && ano % 4 == 0 ... → false

Nenhuma condição satisfeita → imprime: "Não valida"

Saída esperada:
Não valida
*/
