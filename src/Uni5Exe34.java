import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contasEncerradas = 0;

        while (true) {
            int opcao = scanner.nextInt();
            if (opcao == 1) {
                String nome = scanner.next();
                int diarias = scanner.nextInt();
                double taxaServico;
                if (diarias < 15) {
                    taxaServico = 7.5;
                } else if (diarias == 15) {
                    taxaServico = 6.5;
                } else {
                    taxaServico = 5.0;
                }
                double total = diarias * 50.0 + diarias * taxaServico;
                System.out.printf("%s %.2f%n", nome, total);
                contasEncerradas++;
            } else if (opcao == 2) {
                System.out.println("Contas encerradas: " + contasEncerradas);
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opcao invalida");
            }
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
1 -> "Joao" 10 -> 3

Passo a passo:
Opção 1 -> calcula total: diária 50 + taxa 7.5 -> valor = 10 * (50 + 7.5) = 575.00 -> imprime "Joao 575.00" -> contasEncerradas = 1
Opção 3 encerra o programa

Saída:
Joao 575.00

---------------------------------------------------

Teste de Mesa 2:
Entrada:
1 -> "Maria" 15 -> 1 -> "Pedro" 20 -> 2 -> 3

Passo a passo:
Maria: diárias = 15 -> taxa = 6.5 -> total = 15 * (50 + 6.5) = 862.50 -> contasEncerradas = 1
Pedro: diárias = 20 -> taxa = 5.0 -> total = 20 * (50 + 5.0) = 1100.00 -> contasEncerradas = 2
Opção 2 -> imprime "Contas encerradas: 2"
Opção 3 -> encerra

Saída:
Maria 862.50
Pedro 1100.00
Contas encerradas: 2

---------------------------------------------------

Teste de Mesa 3:
Entrada:
2 -> 3

Passo a passo:
Opção 2 antes de qualquer conta -> imprime "Contas encerradas: 0"
Opção 3 -> finaliza

Saída:
Contas encerradas: 0
*/
