import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int marquinhos = scanner.nextInt();
        int zezinho = scanner.nextInt();
        int luluzinha = scanner.nextInt();

        int menorIdade = 999;
        String menorIdadeName = "";

        int i = 0;
        while (i <= 2) {
            if (i == 0) {
                if (menorIdade > marquinhos) {
                    menorIdade = marquinhos;
                    menorIdadeName = "Marquinhos";
                }
            }

            if (i == 1) {
                if (menorIdade > zezinho) {
                    menorIdade = zezinho;
                    menorIdadeName = "Zezinho";
                }
            }

            if (i == 2) {
                if (menorIdade > luluzinha) {
                    menorIdade = luluzinha;
                    menorIdadeName = "Luluzinha";
                }
            }

            i++;
        }

        System.out.print("O " + menorIdadeName + " é o caçula.");

        scanner.close();
    }
}

/*
Teste de Mesa 1:
Entrada:
marquinhos = 10
zezinho = 12
luluzinha = 9

Passo a passo:
menorIdade = 999

i = 0 → menorIdade > marquinhos → 999 > 10 → true
menorIdade = 10, menorIdadeName = "Marquinhos"

i = 1 → menorIdade > zezinho → 10 > 12 → false → não muda

i = 2 → menorIdade > luluzinha → 10 > 9 → true
menorIdade = 9, menorIdadeName = "Luluzinha"

Saída esperada:
O Luluzinha é o caçula.

---------------------------------------------------

Teste de Mesa 2:
Entrada:
marquinhos = 7
zezinho = 7
luluzinha = 8

Passo a passo:
menorIdade = 999

i = 0 → 999 > 7 → true → menorIdade = 7, menorIdadeName = "Marquinhos"
i = 1 → 7 > 7 → false → não muda
i = 2 → 7 > 8 → false → não muda

Saída esperada:
O Marquinhos é o caçula.

---------------------------------------------------

Teste de Mesa 3:
Entrada:
marquinhos = 15
zezinho = 10
luluzinha = 12

Passo a passo:
menorIdade = 999

i = 0 → 999 > 15 → true → menorIdade = 15, menorIdadeName = "Marquinhos"
i = 1 → 15 > 10 → true → menorIdade = 10, menorIdadeName = "Zezinho"
i = 2 → 10 > 12 → false → não muda

Saída esperada:
O Zezinho é o caçula.
*/
