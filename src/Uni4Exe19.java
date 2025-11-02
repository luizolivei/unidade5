import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("x = ");
        double x = scanner.nextDouble();

        System.out.print("y = ");
        double y = scanner.nextDouble();

        scanner.close();

        int quadrante;

        if (x == 0 && y == 0) {
            System.out.print("Quadrante 0");
            return;
        }

        if (x > 0 && y > 0) {
            System.out.print("Quadrante 1");
            return;
        }

        if (x > 0 && y < 0) {
            System.out.print("Quadrante 2");
            return;
        }
        if (x < 0 && y < 0) {
            System.out.print("Quadrante 3");
            return;
        }

        if (x < 0 && y > 0) {
            System.out.print("Quadrante 4");
            return;
        }

    }
}

/*
Teste de Mesa 1:
Entrada:
x = 5
y = 7

Passo a passo:
x == 0 && y == 0 → false
x > 0 && y > 0 → 5 > 0 && 7 > 0 → true
Imprime: "Quadrante 1"

Saída esperada:
Quadrante 1

---------------------------------------------------

Teste de Mesa 2:
Entrada:
x = -3
y = -4

Passo a passo:
x == 0 && y == 0 → false
x > 0 && y > 0 → false
x > 0 && y < 0 → false
x < 0 && y < 0 → -3 < 0 && -4 < 0 → true
Imprime: "Quadrante 3"

Saída esperada:
Quadrante 3

---------------------------------------------------

Teste de Mesa 3:
Entrada:
x = 0
y = 0

Passo a passo:
x == 0 && y == 0 → true
Imprime: "Quadrante 0"

Saída esperada:
Quadrante 0
*/
