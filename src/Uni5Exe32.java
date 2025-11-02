import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiroDia = scanner.nextInt();
        int numeroDias = scanner.nextInt();

        System.out.println("D  S  T  Q  Q  S  S");

        int posicaoSemana = 1;
        while (posicaoSemana < primeiroDia) {
            System.out.print("   ");
            posicaoSemana++;
        }

        int dia = 1;
        while (dia <= numeroDias) {
            while (posicaoSemana <= 7 && dia <= numeroDias) {
                System.out.printf("%2d ", dia);
                dia++;
                posicaoSemana++;
            }
            while (posicaoSemana <= 7) {
                System.out.print("   ");
                posicaoSemana++;
            }
            System.out.println();
            posicaoSemana = 1;
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
primeiroDia = 3 (terça-feira), numeroDias = 31

Passo a passo:
Imprime cabeçalho "D  S  T  Q  Q  S  S"
posicaoSemana = 1 -> imprime dois espaços (para domingo e segunda)
Preenche dias de 1 a 31 distribuindo três linhas completas e uma parcial

Saída (trecho):
D  S  T  Q  Q  S  S
      1  2  3  4  5
 6  7  8  9 10 11 12
13 14 15 16 17 18 19
20 21 22 23 24 25 26
27 28 29 30 31

---------------------------------------------------

Teste de Mesa 2:
Entrada:
primeiroDia = 1 (domingo), numeroDias = 30

Passo a passo:
Nenhum espaço inicial -> dia 1 começa na primeira coluna
Imprime quatro linhas completas e uma parcial com o dia 30

Saída (trecho):
D  S  T  Q  Q  S  S
 1  2  3  4  5  6  7
 8  9 10 11 12 13 14
15 16 17 18 19 20 21
22 23 24 25 26 27 28
29 30

---------------------------------------------------

Teste de Mesa 3:
Entrada:
primeiroDia = 7 (sábado), numeroDias = 28

Passo a passo:
posicaoSemana avança até sábado antes de imprimir o dia 1
Os dias ocupam apenas as duas últimas colunas da primeira linha e seguem nas demais

Saída (trecho):
D  S  T  Q  Q  S  S
                  1
 2  3  4  5  6  7  8
 9 10 11 12 13 14 15
16 17 18 19 20 21 22
23 24 25 26 27 28
*/
