import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaAlturas = 0.0;
        int quantidadePessoas = 0;
        double somaAlturasMulheres = 0.0;
        int quantidadeMulheres = 0;

        while (true) {
            double altura = scanner.nextDouble();
            if (altura == 0) {
                break;
            }
            String generoTexto = scanner.next();
            char genero = generoTexto.charAt(0);

            somaAlturas += altura;
            quantidadePessoas++;

            if (genero == 'F' || genero == 'f') {
                somaAlturasMulheres += altura;
                quantidadeMulheres++;
            }
        }

        if (quantidadeMulheres > 0) {
            double mediaMulheres = somaAlturasMulheres / quantidadeMulheres;
            System.out.printf("A media da altura das mulheres e: %.2f%n", mediaMulheres);
        } else {
            System.out.println("A media da altura das mulheres e: 0.00");
        }

        if (quantidadePessoas > 0) {
            double mediaGrupo = somaAlturas / quantidadePessoas;
            System.out.printf("A media de altura do grupo e: %.2f%n", mediaGrupo);
        } else {
            System.out.println("A media de altura do grupo e: 0.00");
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
1.85 M, 1.58 F, 1.67 f, 1.90 O, 0

Passo a passo:
Leitura 1 → altura = 1.85 → genero 'M' → somaAlturas = 1.85 → quantidadePessoas = 1
Leitura 2 → altura = 1.58 → genero 'F' → somaAlturas = 3.43 → somaAlturasMulheres = 1.58 → contadores 2 e 1
Leitura 3 → altura = 1.67 → genero 'f' → somaAlturas = 5.10 → somaAlturasMulheres = 3.25 → quantidades 3 e 2
Leitura 4 → altura = 1.90 → genero 'O' → somaAlturas = 7.00 → quantidadePessoas = 4
Leitura 5 → altura = 0 → encerra
mediaMulheres = 3.25 / 2 = 1.62 → mediaGrupo = 7.00 / 4 = 1.75

Saída:
A media da altura das mulheres e: 1.62
A media de altura do grupo e: 1.75

---------------------------------------------------

Teste de Mesa 2:
Entrada:
1.80 M, 1.70 M, 1.75 m, 0

Passo a passo:
Nenhuma altura com genero 'F' ou 'f' → quantidadeMulheres = 0
somaAlturas = 1.80 + 1.70 + 1.75 = 5.25 → quantidadePessoas = 3 → mediaGrupo = 1.75
Como não há mulheres → imprime média feminina 0.00

Saída:
A media da altura das mulheres e: 0.00
A media de altura do grupo e: 1.75

---------------------------------------------------

Teste de Mesa 3:
Entrada:
0

Passo a passo:
Primeira leitura já é 0 → laço termina sem somar dados

Saída:
A media da altura das mulheres e: 0.00
A media de altura do grupo e: 0.00
*/
