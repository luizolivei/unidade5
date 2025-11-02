import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        while (quantidade <= 2) {
            quantidade = scanner.nextInt();
        }

        int base = 8;
        int gerados = 0;

        while (gerados < quantidade) {
            System.out.println(base);
            gerados++;
            if (gerados < quantidade) {
                System.out.println(base + 2);
                gerados++;
            }
            base *= 2;
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
quantidade = 4

Passo a passo:
quantidade > 2 → não entra no while de validação
base = 8, gerados = 0
Iteração 1 → imprime 8, gerados = 1 → ainda < quantidade → imprime 10, gerados = 2 → base passa para 16
Iteração 2 → imprime 16, gerados = 3 → imprime 18, gerados = 4 → laço encerra

Saída:
8
10
16
18

---------------------------------------------------

Teste de Mesa 2:
Entrada:
quantidade = 5

Passo a passo:
Iteração 1 → imprime 8 e 10 → gerados = 2 → base = 16
Iteração 2 → imprime 16 e 18 → gerados = 4 → base = 32
Iteração 3 → imprime 32 → gerados = 5 → laço termina (não imprime base+2 porque gerados == quantidade)

Saída:
8
10
16
18
32

---------------------------------------------------

Teste de Mesa 3:
Entrada:
primeira leitura = 2, segunda leitura = 6 (a primeira é rejeitada por ser <= 2)

Passo a passo:
Enquanto quantidade <= 2 → lê novamente → quantidade passa a 6
Iteração 1 → imprime 8 e 10 → gerados = 2 → base = 16
Iteração 2 → imprime 16 e 18 → gerados = 4 → base = 32
Iteração 3 → imprime 32 e 34 → gerados = 6 → laço encerra

Saída:
8
10
16
18
32
34
*/
