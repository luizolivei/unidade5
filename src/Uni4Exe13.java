import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informa as 3 cartas: ");
        int carta1 = scanner.nextInt();

        int carta2 = scanner.nextInt();

        int carta3 = scanner.nextInt();
        scanner.close();

        int qtCartasBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtCartasBoas += 1;
        }

        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtCartasBoas = qtCartasBoas + 1;
        }

        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtCartasBoas++;
        }

        if (qtCartasBoas == 1) {
            System.out.print("TRUCO");
            return;
        }

        if (qtCartasBoas == 2) {
            System.out.print("SEIS");
            return;
        }

        if (qtCartasBoas == 3) {
            System.out.print("NOVE");
            return;
        }
    }
}

/*
Teste de Mesa 1:
Entrada:
carta1 = 1
carta2 = 5
carta3 = 7

Passo a passo:
qtCartasBoas = 0

carta1 == 1 || 2 || 3 → true → qtCartasBoas = 1
carta2 == 1 || 2 || 3 → false → qtCartasBoas = 1
carta3 == 1 || 2 || 3 → false → qtCartasBoas = 1

qtCartasBoas == 1 → true → imprime: "TRUCO"

Saída esperada:
TRUCO

---------------------------------------------------

Teste de Mesa 2:
Entrada:
carta1 = 2
carta2 = 3
carta3 = 5

Passo a passo:
qtCartasBoas = 0

carta1 → 2 → boa → qtCartasBoas = 1
carta2 → 3 → boa → qtCartasBoas = 2
carta3 → 5 → não boa → qtCartasBoas = 2

qtCartasBoas == 2 → true → imprime: "SEIS"

Saída esperada:
SEIS

---------------------------------------------------

Teste de Mesa 3:
Entrada:
carta1 = 1
carta2 = 2
carta3 = 3

Passo a passo:
qtCartasBoas = 0

carta1 → 1 → boa → qtCartasBoas = 1
carta2 → 2 → boa → qtCartasBoas = 2
carta3 → 3 → boa → qtCartasBoas = 3

qtCartasBoas == 3 → true → imprime: "NOVE"

Saída esperada:
NOVE
*/
