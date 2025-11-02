import java.util.Scanner;

//Escreva um algoritmo para ler a idade de 3 irmãos, escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS.
//Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes.

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int irmao1 = scanner.nextInt();
        int irmao2 = scanner.nextInt();
        int irmao3 = scanner.nextInt();
        scanner.close();

        if (irmao1 == irmao2 && irmao2 == irmao3) {
            System.out.print("TRIGÊMEOS");
            return;
        }

        if (irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao3) {
            System.out.print("GEMEOS");
            return;
        }

        System.out.print("APENAS IRMÃOS");

    }
}

/*
Teste de Mesa 1:
Entrada:
irmao1 = 10
irmao2 = 10
irmao3 = 10

Passo a passo:
irmao1 == irmao2 && irmao2 == irmao3 → 10 == 10 && 10 == 10 → true
Imprime: "TRIGÊMEOS"

Saída esperada:
TRIGÊMEOS

---------------------------------------------------

Teste de Mesa 2:
Entrada:
irmao1 = 8
irmao2 = 8
irmao3 = 12

Passo a passo:
irmao1 == irmao2 && irmao2 == irmao3 → 8 == 8 && 8 == 12 → false
irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao3 → 8 == 8 || 8 == 12 || 8 == 12 → true
Imprime: "GEMEOS"

Saída esperada:
GEMEOS

---------------------------------------------------

Teste de Mesa 3:
Entrada:
irmao1 = 7
irmao2 = 9
irmao3 = 11

Passo a passo:
irmao1 == irmao2 && irmao2 == irmao3 → 7 == 9 && 9 == 11 → false
irmao1 == irmao2 || irmao1 == irmao3 || irmao2 == irmao3 → 7 == 9 || 7 == 11 || 9 == 11 → false
Imprime: "APENAS IRMÃOS"

Saída esperada:
APENAS IRMÃOS
*/
