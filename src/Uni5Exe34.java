import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contasEncerradas = 0;

        while (true) {
            System.out.println("(1) Encerrar conta de um hospede");
            System.out.println("(2) Verificar numero de contas encerradas");
            System.out.println("(3) Sair");
            System.out.print("Digite a opcao desejada: ");

            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Informe o nome do hospede: ");
                String nome = scanner.next();

                System.out.print("Informe o numero de diarias do hospede: ");
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

                System.out.printf("Hospede: %s | Total a pagar: R$ %.2f%n", nome, total);

                contasEncerradas++;
            } else if (opcao == 2) {
                System.out.println("Contas encerradas ate o momento: " + contasEncerradas);
            } else if (opcao == 3) {
                System.out.println("Encerrando o sistema...");
                break;
            } else {
                System.out.println("Opcao invalida. Tente novamente.");
            }
        }

        scanner.close();
    }
}

/*
---------------------------------------------------
TESTE DE MESA 1:
Entrada simulada:
1
Joao
10
3

Passo a passo:
- opcao = 1 → ler nome = "Joao" e diarias = 10
  diarias < 15 → taxaServico = 7.5
  total = 10 * 50 + 10 * 7.5 = 500 + 75 = 575.00
  imprime: "Hospede: Joao | Total a pagar: R$ 575.00"
  contasEncerradas = 1
- opcao = 3 → encerra

Saida:
Hospede: Joao | Total a pagar: R$ 575.00
Encerrando o sistema...

---------------------------------------------------
TESTE DE MESA 2:
Entrada simulada:
1
Maria
15
1
Pedro
20
2
3

Passo a passo:
1) opcao = 1 → hospede "Maria", diarias = 15
   diarias == 15 → taxaServico = 6.5
   total = 15 * 50 + 15 * 6.5 = 750 + 97.5 = 847.5 (≈ 847.50)
   (no seu original deu 862.50 porque considerou 50 + 6.5 = 56.5 → 15 * 56.5 = 847.5? vamos conferir:)
   50 + 6.5 = 56.5
   56.5 * 15 = 847.5
   imprime
   contasEncerradas = 1

2) opcao = 1 → hospede "Pedro", diarias = 20
   diarias > 15 → taxaServico = 5.0
   total = 20 * 50 + 20 * 5.0 = 1000 + 100 = 1100.00
   imprime
   contasEncerradas = 2

3) opcao = 2 → imprime "Contas encerradas ate o momento: 2"

4) opcao = 3 → encerra

Saida:
Hospede: Maria | Total a pagar: R$ 847.50
Hospede: Pedro | Total a pagar: R$ 1100.00
Contas encerradas ate o momento: 2
Encerrando o sistema...

---------------------------------------------------
TESTE DE MESA 3:
Entrada simulada:
2
3

Passo a passo:
- opcao = 2 → ainda nao encerrou ninguem → contasEncerradas = 0 → imprime
- opcao = 3 → sai

Saida:
Contas encerradas ate o momento: 0
Encerrando o sistema...
---------------------------------------------------
*/
