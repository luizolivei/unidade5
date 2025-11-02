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
// Teste de mesa 1: opcao 1 Joao 10 imprime Joao 575.00
// Teste de mesa 2: opcao 1 Maria 15 imprime Maria 862.50 e opcao 2 mostra 2 contas
// Teste de mesa 3: opcao 3 encerra sem leituras adicionais
