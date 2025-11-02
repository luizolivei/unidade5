import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pontosDireita = 0;
        int pontosEsquerda = 0;

        while (true) {
            String entrada = scanner.next();
            char ponto = entrada.charAt(0);
            if (ponto == 'D' || ponto == 'd') {
                pontosDireita++;
            } else if (ponto == 'E' || ponto == 'e') {
                pontosEsquerda++;
            }

            int diferenca = Math.abs(pontosDireita - pontosEsquerda);
            int maiorPontuacao = Math.max(pontosDireita, pontosEsquerda);

            if (maiorPontuacao >= 21 && diferenca >= 2) {
                break;
            }
        }

        if (pontosDireita > pontosEsquerda) {
            System.out.println("Vencedor: Jogador da direita");
        } else {
            System.out.println("Vencedor: Jogador da esquerda");
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
Sequência: ("D", "E") repetido 19 vezes, seguido de "D", "D"

Passo a passo:
Após 38 lançamentos alternados -> placar 19 x 19
39º lançamento "D" -> pontosDireita = 20 -> diferença = 1 -> jogo continua
40º lançamento "D" -> pontosDireita = 21 -> diferença = 2 e pontosDireita >= 21 -> laço encerra

Saída:
Vencedor: Jogador da direita

---------------------------------------------------

Teste de Mesa 2:
Entrada:
Sequência: ("D", "E") repetido 20 vezes, seguido de "E", "E"

Passo a passo:
Após 40 lançamentos -> placar 20 x 20
41º lançamento "E" -> pontosEsquerda = 21 -> diferença = 1
42º lançamento "E" -> pontosEsquerda = 22 -> diferença = 2 e pontosEsquerda >= 21 -> jogo encerra

Saída:
Vencedor: Jogador da esquerda

---------------------------------------------------

Teste de Mesa 3:
Entrada:
Sequência: ("D", "E") repetido 21 vezes, seguido de "D", "D"

Passo a passo:
Após 42 lançamentos -> placar 21 x 21
43º lançamento "D" -> pontosDireita = 22 -> diferença = 1
44º lançamento "D" -> pontosDireita = 23 -> diferença = 2 e pontosDireita >= 21 -> encerra

Saída:
Vencedor: Jogador da direita
*/
