import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com um valor inteiro maior do que 0:\n");

        int valor = scanner.nextInt();

        if (valor % 2 == 0) {
        System.out.print("Numero é impar\n");
        } else {
        System.out.print("Numero é par\n");
        }

        scanner.close();
    }
}

/*
Teste de Mesa 1:
Entrada:
valor = 4

Cálculo:
4 % 2 == 0 → true
Então imprime: "Numero é impar"  (inverso do esperado)

Saída esperada do código atual:
Numero é impar

---------------------------------------------------

Teste de Mesa 2:
Entrada:
valor = 7

Cálculo:
7 % 2 == 0 → false
Então imprime: "Numero é par" (inverso do esperado)

Saída esperada do código atual:
Numero é par

---------------------------------------------------

Teste de Mesa 3:
Entrada:
valor = 10

Cálculo:
10 % 2 == 0 → true
Então imprime: "Numero é impar" (inverso do esperado)

Saída esperada do código atual:
Numero é impar
*/
