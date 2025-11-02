import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nota 1 = ");
        double n1 = scanner.nextDouble();

        System.out.print("nota 2 = ");
        double n2 = scanner.nextDouble();

        System.out.print("nota 3 = ");
        double n3 = scanner.nextDouble();

        System.out.print("nota dos exercicios = ");
        double exercicios = scanner.nextDouble();

        scanner.close();

        double media = (n1 + (n2 * 2) + (n3 * 3) + exercicios) / 7;

        System.out.printf("A média de aproveitamento foi: %.2f%n", media);

        if (media >= 9.0) {
            System.out.print("Conceito: A\n");
            System.out.print("Aprovado");
            return;
        }

        if (media >= 7.5 && media < 9.0) {
            System.out.print("Conceito: B\n");
            System.out.print("Aprovado");
            return;
        }

        if (media >= 6.0 && media < 7.5) {
            System.out.print("Conceito: C\n");
            System.out.print("Aprovado");
            return;
        }

        if (media >= 4.0 && media < 6.0) {
            System.out.print("Conceito: D\n");
            System.out.print("Reprovado");
            return;
        }

        if (media < 4.0) {
            System.out.print("Conceito: E\n");
            System.out.print("Reprovado");
            return;
        }
    }
}

/*
Teste de Mesa 1:
Entrada:
n1 = 8
n2 = 7
n3 = 9
exercicios = 10

Passo a passo:
media = (8 + (7*2) + (9*3) + 10) / 7
media = (8 + 14 + 27 + 10) / 7
media = 59 / 7 ≈ 8.43

Conceito:
media >= 7.5 && media < 9.0 → true
Imprime: "Conceito: B"
Imprime: "Aprovado"

Saída esperada:
A média de aproveitamento foi: 8.43
Conceito: B
Aprovado

---------------------------------------------------

Teste de Mesa 2:
Entrada:
n1 = 5
n2 = 4
n3 = 6
exercicios = 5

Passo a passo:
media = (5 + (4*2) + (6*3) + 5) / 7
media = (5 + 8 + 18 + 5) / 7
media = 36 / 7 ≈ 5.14

Conceito:
media >= 4.0 && media < 6.0 → true
Imprime: "Conceito: D"
Imprime: "Reprovado"

Saída esperada:
A média de aproveitamento foi: 5.14
Conceito: D
Reprovado

---------------------------------------------------

Teste de Mesa 3:
Entrada:
n1 = 10
n2 = 9
n3 = 10
exercicios = 10

Passo a passo:
media = (10 + (9*2) + (10*3) + 10) / 7
media = (10 + 18 + 30 + 10) / 7
media = 68 / 7 ≈ 9.71

Conceito:
media >= 9.0 → true
Imprime: "Conceito: A"
Imprime: "Aprovado"

Saída esperada:
A média de aproveitamento foi: 9.71
Conceito: A
Aprovado
*/
