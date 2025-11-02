import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = scanner.nextInt();
        int numeroAtual = 1;

        for (int linha = 1; linha <= linhas; linha++) {
            for (int coluna = 1; coluna <= linha; coluna++) {
                System.out.print(numeroAtual + " ");
                numeroAtual++;
            }
            System.out.println();
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
linhas = 1

Passo a passo:
numeroAtual inicia em 1
Linha 1 -> coluna 1 -> imprime "1 " -> numeroAtual passa para 2 -> quebra de linha

Saída:
1

---------------------------------------------------

Teste de Mesa 2:
Entrada:
linhas = 3

Passo a passo:
Linha 1 -> imprime "1 "
Linha 2 -> imprime "2 3 "
Linha 3 -> imprime "4 5 6 "
Após cada linha ocorre System.out.println()

Saída:
1
2 3
4 5 6

---------------------------------------------------

Teste de Mesa 3:
Entrada:
linhas = 4

Passo a passo:
numeroAtual progride de 1 até 10 (1 + 2 + 3 + 4)
Cada linha adiciona um número a mais que a anterior

Saída:
1
2 3
4 5 6
7 8 9 10
*/
