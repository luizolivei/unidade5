import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro numero inteiro:\n");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Segundo numero:\n");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.print("O valor " + primeiroNumero + " é maior que o valor " + segundoNumero);
        }

        if (primeiroNumero < segundoNumero) {
            System.out.print("O valor " + segundoNumero + " é maior que o valor " + primeiroNumero);
        }

        if (primeiroNumero == segundoNumero) {
            System.out.print("Os numeros sao iguais");
        }

        scanner.close();
    }
}

/*
Teste de Mesa 1:
Entrada:
primeiroNumero = 10
segundoNumero = 5

Passo a passo:
10 > 5 → true → imprime: "O valor 10 é maior que o valor 5"
10 < 5 → false → não imprime
10 == 5 → false → não imprime

Saída esperada:
O valor 10 é maior que o valor 5

---------------------------------------------------

Teste de Mesa 2:
Entrada:
primeiroNumero = 3
segundoNumero = 8

Passo a passo:
3 > 8 → false → não imprime
3 < 8 → true → imprime: "O valor 8 é maior que o valor 3"
3 == 8 → false → não imprime

Saída esperada:
O valor 8 é maior que o valor 3

---------------------------------------------------

Teste de Mesa 3:
Entrada:
primeiroNumero = 7
segundoNumero = 7

Passo a passo:
7 > 7 → false → não imprime
7 < 7 → false → não imprime
7 == 7 → true → imprime: "Os numeros sao iguais"

Saída esperada:
Os numeros sao iguais
*/
