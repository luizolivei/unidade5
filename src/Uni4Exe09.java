import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();

        int resto = val1 % val2;

        if (resto == 0) {
            System.out.println("Os valores são múltiplos.");
        } else {
            System.out.println("Os valores não são múltiplos.");
        }

        scanner.close();
    }
}/*
Teste de Mesa 1:
Entrada:
val1 = 12
val2 = 3

Passo a passo:
resto = 12 % 3 = 0
resto == 0 → true
Imprime: "Os valores são múltiplos."

Saída esperada:
Os valores são múltiplos.

---------------------------------------------------

Teste de Mesa 2:
Entrada:
val1 = 7
val2 = 2

Passo a passo:
resto = 7 % 2 = 1
resto == 0 → false
Imprime: "Os valores não são múltiplos."

Saída esperada:
Os valores não são múltiplos.

---------------------------------------------------

Teste de Mesa 3:
Entrada:
val1 = 20
val2 = 5

Passo a passo:
resto = 20 % 5 = 0
resto == 0 → true
Imprime: "Os valores são múltiplos."

Saída esperada:
Os valores são múltiplos.
*/

