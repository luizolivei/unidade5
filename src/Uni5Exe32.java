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
// Teste de mesa 1: p=3 n=31 gera calendario alinhado como exemplo
// Teste de mesa 2: p=1 n=30 inicia em domingo sem espacos iniciais
// Teste de mesa 3: p=7 n=28 imprime apenas colunas finais ocupadas
