import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha seu curso:");
        System.out.println("1 - Ciência da Computação");
        System.out.println("2 - Licenciatura da Computação");
        System.out.println("3 - Sistemas de Informação");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
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
opcao = 1

Passo a passo:
switch(opcao):
case 1 → true
Imprime: "Bacharel em Ciência da Computação"

Saída esperada:
Bacharel em Ciência da Computação

---------------------------------------------------

Teste de Mesa 2:
Entrada:
opcao = 2

Passo a passo:
switch(opcao):
case 2 → true
Imprime: "Licenciado em Computação"

Saída esperada:
Licenciado em Computação

---------------------------------------------------

Teste de Mesa 3:
Entrada:
opcao = 4

Passo a passo:
switch(opcao):
case 1 → false
case 2 → false
case 3 → false
default → true
Imprime: "Opção inválida!"

Saída esperada:
Opção inválida!
*/
