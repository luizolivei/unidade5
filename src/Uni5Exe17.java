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
/*
Teste de Mesa 1:
Entrada:
(125, 1.85), (248, 1.58), (102, 1.67), (300, 1.90), 0

Passo a passo:
Atleta 125 -> primeiro registro -> mais baixo = 1.85 (inscrição 125), mais alto = 1.85 (inscrição 125), soma = 1.85
Atleta 248 -> altura 1.58 -> atualiza mais baixo para 1.58 (inscrição 248), mais alto permanece 1.85 (125), soma = 3.43
Atleta 102 -> altura 1.67 -> não altera extremos -> soma = 5.10
Atleta 300 -> altura 1.90 -> atualiza mais alto para 1.90 (inscrição 300), soma = 7.00
Leitura 0 -> encerra -> média = 7.00 / 4 = 1.75

Saída:
O atleta mais baixo tem 1.58m e o seu numero de inscricao e 248
O atleta mais alto tem 1.90m e o seu numero de inscricao e 300
A altura media do grupo de atletas e: 1.75

---------------------------------------------------

Teste de Mesa 2:
Entrada:
(10, 1.70), 0

Passo a passo:
Primeiro atleta define mais baixo e mais alto como 1.70 -> soma = 1.70 -> quantidade = 1
Entrada 0 encerra -> média = 1.70

Saída:
O atleta mais baixo tem 1.70m e o seu numero de inscricao e 10
O atleta mais alto tem 1.70m e o seu numero de inscricao e 10
A altura media do grupo de atletas e: 1.70

---------------------------------------------------

Teste de Mesa 3:
Entrada:
0

Passo a passo:
Nenhum atleta informado -> quantidade = 0 -> imprime mensagem padrão

Saída:
Nenhum atleta informado
*/
