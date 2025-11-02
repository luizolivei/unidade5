import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inscricaoMaisBaixo = 0;
        double alturaMaisBaixo = Double.POSITIVE_INFINITY;
        int inscricaoMaisAlto = 0;
        double alturaMaisAlto = Double.NEGATIVE_INFINITY;
        double somaAlturas = 0.0;
        int quantidade = 0;

        while (true) {
            int inscricao = scanner.nextInt();
            if (inscricao == 0) {
                break;
            }
            double altura = scanner.nextDouble();

            if (altura < alturaMaisBaixo) {
                alturaMaisBaixo = altura;
                inscricaoMaisBaixo = inscricao;
            }

            if (altura > alturaMaisAlto) {
                alturaMaisAlto = altura;
                inscricaoMaisAlto = inscricao;
            }

            somaAlturas += altura;
            quantidade++;
        }

        if (quantidade > 0) {
            double media = somaAlturas / quantidade;
            System.out.printf("O atleta mais baixo tem %.2fm e o seu numero de inscricao e %d%n", alturaMaisBaixo, inscricaoMaisBaixo);
            System.out.printf("O atleta mais alto tem %.2fm e o seu numero de inscricao e %d%n", alturaMaisAlto, inscricaoMaisAlto);
            System.out.printf("A altura media do grupo de atletas e: %.2f%n", media);
        } else {
            System.out.println("Nenhum atleta informado");
        }

        scanner.close();
    }
}
// Teste de mesa 1: inscricoes 125 1.85, 248 1.58, 102 1.67, 300 1.90, 0 resultados conforme exemplo
// Teste de mesa 2: um atleta 10 1.70 e zero final
// Teste de mesa 3: nenhum atleta entrada 0
