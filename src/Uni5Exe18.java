import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] canais = {4, 5, 9, 12};
        int[] totalPorCanal = new int[canais.length];
        int totalPessoas = 0;

        while (true) {
            int canal = scanner.nextInt();
            if (canal == 0) {
                break;
            }
            int pessoas = scanner.nextInt();
            boolean canalValido = false;
            for (int i = 0; i < canais.length; i++) {
                if (canais[i] == canal) {
                    totalPorCanal[i] += pessoas;
                    canalValido = true;
                    break;
                }
            }
            if (canalValido) {
                totalPessoas += pessoas;
            }
        }

        for (int i = 0; i < canais.length; i++) {
            if (totalPessoas > 0) {
                double percentual = (totalPorCanal[i] * 100.0) / totalPessoas;
                System.out.printf("Percentual de audiencia do canal %d: %.2f%%%n", canais[i], percentual);
            } else {
                System.out.printf("Percentual de audiencia do canal %d: 0.00%%%n", canais[i]);
            }
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
(4, 3), (5, 2), (9, 4), (12, 1), 0

Passo a passo:
Canal 4 → totalPorCanal[0] = 3 → totalPessoas = 3
Canal 5 → totalPorCanal[1] = 2 → totalPessoas = 5
Canal 9 → totalPorCanal[2] = 4 → totalPessoas = 9
Canal 12 → totalPorCanal[3] = 1 → totalPessoas = 10
Percentuais: 30%, 20%, 40%, 10%

Saída:
Percentual de audiencia do canal 4: 30.00%
Percentual de audiencia do canal 5: 20.00%
Percentual de audiencia do canal 9: 40.00%
Percentual de audiencia do canal 12: 10.00%

---------------------------------------------------

Teste de Mesa 2:
Entrada:
(4, 5), (7, 10), 0

Passo a passo:
Canal 4 → soma 5 pessoas
Canal 7 → não está na lista → é ignorado → totalPessoas permanece 5
Percentuais calculados com base em 5 pessoas → canal 4 recebe 100%, demais 0%

Saída:
Percentual de audiencia do canal 4: 100.00%
Percentual de audiencia do canal 5: 0.00%
Percentual de audiencia do canal 9: 0.00%
Percentual de audiencia do canal 12: 0.00%

---------------------------------------------------

Teste de Mesa 3:
Entrada:
0

Passo a passo:
Nenhum canal informado → totalPessoas = 0 → cada percentual é exibido como 0.00%

Saída:
Percentual de audiencia do canal 4: 0.00%
Percentual de audiencia do canal 5: 0.00%
Percentual de audiencia do canal 9: 0.00%
Percentual de audiencia do canal 12: 0.00%
*/
