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
// Teste de mesa 1: votos 1 s 2 s 3 n tot 1 1 1 0 vencedor Nenhum de Nos
// Teste de mesa 2: todos votos no codigo 4 vencedor Jota Quest
// Teste de mesa 3: nenhum voto total 0 mensagem de nenhum voto
