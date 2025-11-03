import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] votos = new int[4];
        boolean continuar = true;

        System.out.println("ELEIÇÃO: Vote no melhor conjunto do ano!");
        System.out.println("1 - Nenhum de Nós");
        System.out.println("2 - CPM22");
        System.out.println("3 - Skank");
        System.out.println("4 - Jota Quest");
        System.out.println("---------------------------------------");

        while (continuar) {
            System.out.print("Digite o código do grupo que deseja votar (1 a 4): ");
            int codigo = scanner.nextInt();

            if (codigo >= 1 && codigo <= 4) {
                votos[codigo - 1]++;
            } else {
                System.out.println("Código inválido! O voto foi desconsiderado.");
            }

            System.out.print("Deseja registrar mais um voto: s (SIM) / n (NAO)? ");
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        int totalVotos = votos[0] + votos[1] + votos[2] + votos[3];

        String[] nomes = {"Nenhum de Nós", "CPM22", "Skank", "Jota Quest"};
        System.out.println("\n===== RESULTADO FINAL =====");

        for (int i = 0; i < votos.length; i++) {
            System.out.println("Total de votos para " + nomes[i] + ": " + votos[i]);
        }

        System.out.println("-----------------------------");

        for (int i = 0; i < votos.length; i++) {
            double percentual = totalVotos > 0 ? (votos[i] * 100.0) / totalVotos : 0.0;
            System.out.printf("Percentual de votos para %s: %.2f%%%n", nomes[i], percentual);
        }

        int indiceVencedor = 0;
        for (int i = 1; i < votos.length; i++) {
            if (votos[i] > votos[indiceVencedor]) {
                indiceVencedor = i;
            }
        }

        System.out.println("-----------------------------");
        if (totalVotos > 0) {
            System.out.println("🏆 Grupo vencedor: " + nomes[indiceVencedor]);
        } else {
            System.out.println("Nenhum voto computado!");
        }

        scanner.close();
    }
}

/*
---------------------------------------------------
TESTE UNITÁRIO 1:
Entrada:
1 s
2 s
3 n

Passo a passo:
Voto 1 → Nenhum de Nós recebe 1 voto
Resposta "s" → continua
Voto 2 → CPM22 recebe 1 voto
Resposta "s" → continua
Voto 3 → Skank recebe 1 voto
Resposta "n" → encerra

Cálculos:
Total de votos = 3
Percentual: 33.33% para cada um dos três primeiros grupos, 0.00% para Jota Quest

Saída esperada:
Total de votos para Nenhum de Nós: 1
Total de votos para CPM22: 1
Total de votos para Skank: 1
Total de votos para Jota Quest: 0
Percentual de votos para Nenhum de Nós: 33.33%
Percentual de votos para CPM22: 33.33%
Percentual de votos para Skank: 33.33%
Percentual de votos para Jota Quest: 0.00%
Grupo vencedor: Nenhum de Nós
---------------------------------------------------

TESTE UNITÁRIO 2:
Entrada:
4 s
4 s
4 n

Passo a passo:
Todos os votos são para Jota Quest
Total de votos = 3
Percentual Jota Quest = 100%

Saída esperada:
Total de votos para Nenhum de Nós: 0
Total de votos para CPM22: 0
Total de votos para Skank: 0
Total de votos para Jota Quest: 3
Percentual de votos para Nenhum de Nós: 0.00%
Percentual de votos para CPM22: 0.00%
Percentual de votos para Skank: 0.00%
Percentual de votos para Jota Quest: 100.00%
 Grupo vencedor: Jota Quest
---------------------------------------------------

TESTE UNITÁRIO 3:
Entrada:
5 n

Passo a passo:
Código inválido → voto desconsiderado
Resposta "n" → encerra sem votos válidos
Total de votos = 0

Saída esperada:
Código inválido! O voto foi desconsiderado.
Total de votos para Nenhum de Nós: 0
Total de votos para CPM22: 0
Total de votos para Skank: 0
Total de votos para Jota Quest: 0
Percentual de votos para Nenhum de Nós: 0.00%
Percentual de votos para CPM22: 0.00%
Percentual de votos para Skank: 0.00%
Percentual de votos para Jota Quest: 0.00%
Nenhum voto computado!
---------------------------------------------------
*/
