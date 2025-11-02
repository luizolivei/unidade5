import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] votos = new int[7];

        while (true) {
            int opcao = scanner.nextInt();
            if (opcao == 0) {
                break;
            }
            if (opcao >= 1 && opcao <= 4) {
                votos[opcao]++;
            } else if (opcao == 5) {
                votos[5]++;
            } else if (opcao == 6) {
                votos[6]++;
            } else {
                System.out.println("Opcao incorreta");
            }
        }

        int totalVotos = votos[1] + votos[2] + votos[3] + votos[4] + votos[5] + votos[6];
        int totalNulos = votos[5];
        int totalBrancos = votos[6];
        double percentualBrancosENulos = totalVotos > 0 ? ((totalNulos + totalBrancos) * 100.0) / totalVotos : 0.0;

        System.out.println("Total de votos para o candidato 1: " + votos[1]);
        System.out.println("Total de votos para o candidato 2: " + votos[2]);
        System.out.println("Total de votos para o candidato 3: " + votos[3]);
        System.out.println("Total de votos para o candidato 4: " + votos[4]);
        System.out.println("Total de votos nulos: " + totalNulos);
        System.out.println("Total de votos em branco: " + totalBrancos);
        System.out.printf("Percentual de brancos e nulos sobre o total: %.2f%%%n", percentualBrancosENulos);

        scanner.close();
    }
}
// Teste de mesa 1: votos 1 2 3 4 5 6 0 computa totais 1 cada percentual 33.33
// Teste de mesa 2: insercao de opcao 7 mostra mensagem de erro
// Teste de mesa 3: somente nulos e brancos calcula percentual 100%
