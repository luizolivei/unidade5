import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] votos = new int[4];
        boolean continuar = true;

        while (continuar) {
            int codigo = scanner.nextInt();
            if (codigo >= 1 && codigo <= 4) {
                votos[codigo - 1]++;
            }
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        int totalVotos = votos[0] + votos[1] + votos[2] + votos[3];

        String[] nomes = {"Nenhum de Nos", "CPM22", "Skank", "Jota Quest"};
        for (int i = 0; i < votos.length; i++) {
            System.out.println("Total de votos para " + nomes[i] + ": " + votos[i]);
        }

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

        if (totalVotos > 0) {
            System.out.println("Grupo vencedor: " + nomes[indiceVencedor]);
        } else {
            System.out.println("Nenhum voto computado");
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
Votos: 1 "s", 2 "s", 3 "n"

Passo a passo:
Voto 1 → incrementa votos[0]
Resposta "s" → continua
Voto 2 → incrementa votos[1]
Resposta "s" → continua
Voto 3 → incrementa votos[2]
Resposta "n" → encerra
Total de votos válidos = 3 → cada grupo citado tem 1 voto

Saída:
Total de votos para Nenhum de Nos: 1
Total de votos para CPM22: 1
Total de votos para Skank: 1
Total de votos para Jota Quest: 0
Percentual de votos para Nenhum de Nos: 33.33%
Percentual de votos para CPM22: 33.33%
Percentual de votos para Skank: 33.33%
Percentual de votos para Jota Quest: 0.00%
Grupo vencedor: Nenhum de Nos

---------------------------------------------------

Teste de Mesa 2:
Entrada:
Votos: 4 "s", 4 "s", 4 "n"

Passo a passo:
Cada voto incrementa votos[3]
Total de votos = 3 → percentual de Jota Quest = 100%

Saída:
Total de votos para Nenhum de Nos: 0
Total de votos para CPM22: 0
Total de votos para Skank: 0
Total de votos para Jota Quest: 3
Percentual de votos para Nenhum de Nos: 0.00%
Percentual de votos para CPM22: 0.00%
Percentual de votos para Skank: 0.00%
Percentual de votos para Jota Quest: 100.00%
Grupo vencedor: Jota Quest

---------------------------------------------------

Teste de Mesa 3:
Entrada:
Voto: 5 "n"

Passo a passo:
Código 5 não é considerado (intervalo válido é 1 a 4)
Resposta "n" encerra sem votos válidos → totalVotos = 0

Saída:
Total de votos para Nenhum de Nos: 0
Total de votos para CPM22: 0
Total de votos para Skank: 0
Total de votos para Jota Quest: 0
Percentual de votos para Nenhum de Nos: 0.00%
Percentual de votos para CPM22: 0.00%
Percentual de votos para Skank: 0.00%
Percentual de votos para Jota Quest: 0.00%
Nenhum voto computado
*/
