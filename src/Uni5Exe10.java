import java.util.Scanner;

public class Uni5Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para testar: ");
        int numero = sc.nextInt();

        if (temPropriedade(numero)) {
            System.out.println(numero + " possui a caracteristica especial");
        } else {
            System.out.println(numero + " nao possui a caracteristica especial.");
        }

        System.out.println("\nOs 10 primeiros numeros com essa propriedade são:");
        int contador = 0;
        int n = 1;

        while (contador < 10) {
            if (temPropriedade(n)) {
                System.out.println(n);
                contador++;
            }
            n++;
        }

        sc.close();
    }

    private static boolean temPropriedade(int numero) {
        String numStr = String.valueOf(numero);

        if (numStr.length() < 2)
            return false;

        int metade = numStr.length() / 2;
        int parte1 = Integer.parseInt(numStr.substring(0, metade));
        int parte2 = Integer.parseInt(numStr.substring(metade));

        int soma = parte1 + parte2;

        return soma * soma == numero;
    }
}

/*
TESTES DE MESA

TESTE 1
Entrada: numero = 81
--------------------------------------------
numStr = "81"
metade = 2 / 2 = 1
parte1 = "8" → 8
parte2 = "1" → 1
soma = 8 + 1 = 9
soma² = 81
81 == 81 → TRUE
Saída esperada:
"81 possui a caracteristica especial!"

Os 10 primeiros numeros com essa propriedade são:
81
2025
3025
9801
88209
494209
998001
4941729
7441984
24502500

--------------------------------------------

TESTE 2
Entrada: numero = 3025
--------------------------------------------
numStr = "3025"
metade = 4 / 2 = 2
parte1 = "30" → 30
parte2 = "25" → 25
soma = 30 + 25 = 55
soma² = 55² = 3025
3025 == 3025 → TRUE
Saída esperada:
"3025 possui a caracteristica especial"

Os 10 primeiros numeros com essa propriedade são:
81
2025
3025
9801
88209
494209
998001
4941729
7441984
24502500

--------------------------------------------

TESTE 3
Entrada: numero = 1234
--------------------------------------------
numStr = "1234"
metade = 4 / 2 = 2
parte1 = "12" → 12
parte2 = "34" → 34
soma = 12 + 34 = 46
soma² = 46² = 2116
2116 != 1234 → FALSE
Saída esperada:
"1234 nao possui a caracteristica especial."

--------------------------------------------

Resultado parcial dos 10 primeiros números encontrados pelo programa:
81
2025
3025
9801
88209
494209
998001
4941729
7441984
24502500
*/
