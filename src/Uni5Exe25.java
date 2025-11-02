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
// Teste de mesa 1: sequencia com 21x19 e mais dois pontos direita vence
// Teste de mesa 2: sequencia onde esquerda abre 22x20 vence esquerda
// Teste de mesa 3: sequencia alternada chegando a 21x23 vence direita
