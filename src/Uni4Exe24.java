import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor 1: ");
        int a = scanner.nextInt();
        System.out.print("Valor 2: ");
        int b = scanner.nextInt();
        System.out.print("Valor 3: ");
        int c = scanner.nextInt();

        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        int meio = a + b + c - max - min;

        switch (opcao) {
            case 1:
                System.out.println(min + " " + meio + " " + max);
                break;
            case 2:
                System.out.println(max + " " + meio + " " + min);
                break;
            case 3:
                System.out.println(min + " " + max + " " + meio);
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}

/*
Teste de Mesa 1:
Entrada:
a = 5
b = 3
c = 2
opcao = 1

Passo a passo:
max = Math.max(5, Math.max(3,2)) = 5
min = Math.min(5, Math.min(3,2)) = 2
meio = 5 + 3 + 2 - 5 - 2 = 3

switch(opcao):
case 1 → true
Imprime: min meio max → 2 3 5

Saída esperada:
2 3 5

---------------------------------------------------

Teste de Mesa 2:
Entrada:
a = 5
b = 3
c = 2
opcao = 2

Passo a passo:
max = 5, min = 2, meio = 3
switch(opcao):
case 2 → true
Imprime: max meio min → 5 3 2

Saída esperada:
5 3 2

---------------------------------------------------

Teste de Mesa 3:
Entrada:
a = 5
b = 3
c = 2
opcao = 3

Passo a passo:
max = 5, min = 2, meio = 3
switch(opcao):
case 3 → true
Imprime: min max meio → 2 5 3

Saída esperada:
2 5 3
*/
