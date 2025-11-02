import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");

        System.out.print("Valor 1: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Valor 2: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Opção: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println(valor1 + valor2);
                break;
            case 2:
                System.out.println(valor1 - valor2);
                break;
            case 3:
                System.out.println(valor1 * valor2);
                break;
            case 4:
                if (valor2 != 0) {
                    System.out.println(valor1 / valor2);
                } else {
                    System.out.println("Erro: divisão por zero!");
                }
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
valor1 = 5
valor2 = 3
opcao = 1

Passo a passo:
switch(opcao):
case 1 → true
Imprime: valor1 + valor2 → 5 + 3 = 8

Saída esperada:
8.0

---------------------------------------------------

Teste de Mesa 2:
Entrada:
valor1 = 15
valor2 = 3
opcao = 4

Passo a passo:
switch(opcao):
case 4 → true
valor2 != 0 → 3 != 0 → true
Imprime: valor1 / valor2 → 15 / 3 = 5

Saída esperada:
5.0

---------------------------------------------------

Teste de Mesa 3:
Entrada:
valor1 = 7
valor2 = 0
opcao = 4

Passo a passo:
switch(opcao):
case 4 → true
valor2 != 0 → 0 != 0 → false
Imprime: "Erro: divisão por zero!"

Saída esperada:
Erro: divisão por zero!
*/
