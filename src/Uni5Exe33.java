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
/*
Teste de Mesa 1:
Entrada:
1, 2, 3, 4, 5, 6, 0

Passo a passo:
Opções 1 a 4 incrementam votos dos candidatos
Opção 5 incrementa nulos, opção 6 incrementa brancos
Entrada 0 encerra
TotalVotos = 6 → percentual de brancos e nulos = (1 + 1) / 6 * 100 ≈ 33.33%

Saída:
Total de votos para o candidato 1: 1
Total de votos para o candidato 2: 1
Total de votos para o candidato 3: 1
Total de votos para o candidato 4: 1
Total de votos nulos: 1
Total de votos em branco: 1
Percentual de brancos e nulos sobre o total: 33.33%

---------------------------------------------------

Teste de Mesa 2:
Entrada:
7, 1, 0

Passo a passo:
Opção 7 → mensagem "Opcao incorreta" → nenhum contador alterado
Opção 1 → candidato 1 recebe +1
Entrada 0 encerra → totalVotos = 1

Saída:
Opcao incorreta
Total de votos para o candidato 1: 1
Total de votos para o candidato 2: 0
Total de votos para o candidato 3: 0
Total de votos para o candidato 4: 0
Total de votos nulos: 0
Total de votos em branco: 0
Percentual de brancos e nulos sobre o total: 0.00%

---------------------------------------------------

Teste de Mesa 3:
Entrada:
5, 6, 6, 5, 0

Passo a passo:
Dois votos nulos e dois em branco → totalVotos = 4 → candidatos recebem 0
Percentual de brancos e nulos = 4/4 * 100 = 100%

Saída:
Total de votos para o candidato 1: 0
Total de votos para o candidato 2: 0
Total de votos para o candidato 3: 0
Total de votos para o candidato 4: 0
Total de votos nulos: 2
Total de votos em branco: 2
Percentual de brancos e nulos sobre o total: 100.00%
*/
