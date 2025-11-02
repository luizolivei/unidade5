import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        int valorAtual = numero;

        while (valorAtual > 1) {
            int fator = menorFatorPrimo(valorAtual);
            System.out.println(valorAtual + " " + fator);
            valorAtual /= fator;
        }

        System.out.println("1");

        scanner.close();
    }

    private static int menorFatorPrimo(int valor) {
        for (int i = 2; i <= valor; i++) {
            if (valor % i == 0) {
                return i;
            }
        }
        return valor;
    }
}
/*
Teste de Mesa 1:
Entrada:
numero = 180

Passo a passo:
menorFatorPrimo(180) = 2 → imprime "180 2" → valorAtual = 90
menorFatorPrimo(90) = 2 → imprime "90 2" → valorAtual = 45
menorFatorPrimo(45) = 3 → imprime "45 3" → valorAtual = 15
menorFatorPrimo(15) = 3 → imprime "15 3" → valorAtual = 5
menorFatorPrimo(5) = 5 → imprime "5 5" → valorAtual = 1 → laço encerra
Por fim imprime "1"

Saída:
180 2
90 2
45 3
15 3
5 5
1

---------------------------------------------------

Teste de Mesa 2:
Entrada:
numero = 13

Passo a passo:
menorFatorPrimo(13) = 13 → imprime "13 13" → valorAtual = 1
Laço encerra e imprime "1"

Saída:
13 13
1

---------------------------------------------------

Teste de Mesa 3:
Entrada:
numero = 100

Passo a passo:
100 → fator 2 → imprime "100 2" → valorAtual = 50
50 → fator 2 → imprime "50 2" → valorAtual = 25
25 → fator 5 → imprime "25 5" → valorAtual = 5
5 → fator 5 → imprime "5 5" → valorAtual = 1
Imprime "1"

Saída:
100 2
50 2
25 5
5 5
1
*/
