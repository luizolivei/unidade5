import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o comprimento do lado1: ");
        int lado1 = scanner.nextInt();

        System.out.print("Entre com o comprimento do lado2: ");
        int lado2 = scanner.nextInt();

        System.out.print("Entre com o comprimento do lado3: ");
        int lado3 = scanner.nextInt();
        scanner.close();

        if (lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.print("É equilátero.");
                return;
            }

            if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.print("É isóceles.");
                return;
            }

            System.out.print("É escaleno.");
        } else {
            System.out.print("Não formam um triangulo");
            return;
        }
    }
}

/*
Teste de Mesa 1:
Entrada:
lado1 = 5
lado2 = 5
lado3 = 5

Passo a passo:
Verifica se forma triângulo:
5 < 5 + 5 → 5 < 10 → true
5 < 5 + 5 → true
5 < 5 + 5 → true → forma triângulo

Verifica tipo:
lado1 == lado2 && lado2 == lado3 → 5 == 5 && 5 == 5 → true
Imprime: "É equilátero."

Saída esperada:
É equilátero.

---------------------------------------------------

Teste de Mesa 2:
Entrada:
lado1 = 6
lado2 = 6
lado3 = 4

Passo a passo:
Forma triângulo:
6 < 6 + 4 → 6 < 10 → true
6 < 6 + 4 → true
4 < 6 + 6 → 4 < 12 → true → forma triângulo

Tipo:
lado1 == lado2 && lado2 == lado3 → 6 == 6 && 6 == 4 → false
lado1 == lado2 || lado1 == lado3 || lado2 == lado3 → 6 == 6 || 6 == 4 || 6 == 4 → true
Imprime: "É isóceles."

Saída esperada:
É isóceles.

---------------------------------------------------

Teste de Mesa 3:
Entrada:
lado1 = 3
lado2 = 4
lado3 = 5

Passo a passo:
Forma triângulo:
3 < 4 + 5 → 3 < 9 → true
4 < 3 + 5 → 4 < 8 → true
5 < 3 + 4 → 5 < 7 → true → forma triângulo

Tipo:
lado1 == lado2 && lado2 == lado3 → false
lado1 == lado2 || lado1 == lado3 || lado2 == lado3 → false
Imprime: "É escaleno."

Saída esperada:
É escaleno.
*/
