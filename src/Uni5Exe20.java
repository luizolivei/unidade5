import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double massaInicial = scanner.nextDouble();
        double massaAtual = massaInicial;
        int tempo = 0;

        while (massaAtual >= 0.0005) {
            massaAtual /= 2.0;
            tempo += 50;
        }

        System.out.printf("Massa inicial: %.4f kg%n", massaInicial);
        System.out.printf("Massa final: %.6f kg%n", massaAtual);
        System.out.println("Tempo necessario: " + tempo + " segundos");

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
massaInicial = 1.0

Passo a passo:
tempo começa em 0, massaAtual = 1.0
Cada iteração divide massaAtual por 2 e soma 50 segundos
Quantidade de divisões até massaAtual < 0.0005 → 11 vezes
tempo final = 11 * 50 = 550 segundos
massaAtual ≈ 0.000488

Saída:
Massa inicial: 1.0000 kg
Massa final: 0.000488 kg
Tempo necessario: 550 segundos

---------------------------------------------------

Teste de Mesa 2:
Entrada:
massaInicial = 0.0004

Passo a passo:
massaAtual < 0.0005 → o while não executa
tempo permanece 0 → massaAtual segue 0.0004

Saída:
Massa inicial: 0.0004 kg
Massa final: 0.000400 kg
Tempo necessario: 0 segundos

---------------------------------------------------

Teste de Mesa 3:
Entrada:
massaInicial = 0.5

Passo a passo:
Iteração 1 → massaAtual = 0.25 → tempo = 50
Iteração 2 → massaAtual = 0.125 → tempo = 100
... continua até massaAtual < 0.0005 (10 divisões no total)
tempo final = 500 segundos → massaAtual ≈ 0.000488

Saída:
Massa inicial: 0.5000 kg
Massa final: 0.000488 kg
Tempo necessario: 500 segundos
*/
