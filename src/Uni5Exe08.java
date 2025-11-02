import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        int menorNegativo = Integer.MAX_VALUE;
        boolean temNegativo = false;
        int somaPositivos = 0;
        int quantidadePositivos = 0;

        for (int i = 0; i < quantidade; i++) {
            int numero = scanner.nextInt();
            if (numero < 0) {
                if (!temNegativo || numero < menorNegativo) {
                    menorNegativo = numero;
                }
                temNegativo = true;
            } else if (numero > 0) {
                somaPositivos += numero;
                quantidadePositivos++;
            }
        }

        if (temNegativo) {
            System.out.println("Menor valor negativo: " + menorNegativo);
        } else {
            System.out.println("Menor valor negativo: nenhum valor negativo informado");
        }

        if (quantidadePositivos > 0) {
            double mediaPositivos = (double) somaPositivos / quantidadePositivos;
            System.out.printf("Media dos numeros positivos: %.2f%n", mediaPositivos);
        } else {
            System.out.println("Media dos numeros positivos: 0.00");
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
quantidade = 5
valores = [2, -1, -8, 4, 3]

Passo a passo:
Iteração 1 -> numero = 2 -> positivo -> somaPositivos = 2, quantidadePositivos = 1
Iteração 2 -> numero = -1 -> primeiro negativo -> menorNegativo = -1, temNegativo = true
Iteração 3 -> numero = -8 -> negativo menor -> menorNegativo atualizado para -8
Iteração 4 -> numero = 4 -> somaPositivos = 6, quantidadePositivos = 2
Iteração 5 -> numero = 3 -> somaPositivos = 9, quantidadePositivos = 3
mediaPositivos = 9 / 3 = 3.00

Saída:
Menor valor negativo: -8
Media dos numeros positivos: 3.00

---------------------------------------------------

Teste de Mesa 2:
Entrada:
quantidade = 3
valores = [-2, -3, -1]

Passo a passo:
Iteração 1 -> numero = -2 -> menorNegativo = -2
Iteração 2 -> numero = -3 -> menorNegativo atualizado para -3
Iteração 3 -> numero = -1 -> menorNegativo permanece -3
Nenhum positivo lido -> quantidadePositivos = 0

Saída:
Menor valor negativo: -3
Media dos numeros positivos: 0.00

---------------------------------------------------

Teste de Mesa 3:
Entrada:
quantidade = 4
valores = [1, 2, 3, 4]

Passo a passo:
Nenhum número negativo -> temNegativo = false
SomaPositivos = 1 + 2 + 3 + 4 = 10
quantidadePositivos = 4 -> média = 10 / 4 = 2.50

Saída:
Menor valor negativo: nenhum valor negativo informado
Media dos numeros positivos: 2.50
*/
