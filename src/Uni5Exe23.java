import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.print("Nome do vendedor: ");
            String nome = scanner.nextLine();

            System.out.print("Quantos produtos foram vendidos por " + nome + "? ");
            int produtos = Integer.parseInt(scanner.nextLine());

            double totalVendas = 0.0;

            for (int i = 1; i <= produtos; i++) {
                System.out.print("Produto " + i + " - preco unitario: ");
                double preco = Double.parseDouble(scanner.nextLine());

                System.out.print("Produto " + i + " - quantidade vendida: ");
                int quantidade = Integer.parseInt(scanner.nextLine());

                totalVendas += preco * quantidade;
            }

            double salario = totalVendas * 0.30;

            System.out.println("\n--- RELATORIO DO VENDEDOR ---");
            System.out.println("Nome: " + nome);
            System.out.printf("Total de vendas: R$ %.2f%n", totalVendas);
            System.out.printf("Salario (30%%): R$ %.2f%n", salario);
            System.out.println("-----------------------------\n");

            System.out.print("Deseja digitar os dados de mais um vendedor: s (SIM) / n (NAO)? ");
            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }

        scanner.close();
    }
}

/*
---------------------------------------------------
TESTE UNITÁRIO 1:
Entrada:
Nome: Ana
Quantos produtos foram vendidos por Ana? 2
Produto 1 - preco unitario: 10
Produto 1 - quantidade vendida: 3
Produto 2 - preco unitario: 5
Produto 2 - quantidade vendida: 2
Deseja digitar os dados de mais um vendedor: n

Passo a passo:
Produto 1 -> totalVendas = 10 * 3 = 30
Produto 2 -> totalVendas = 30 + (5 * 2) = 40
salario = 40 * 0.30 = 12

Saída esperada:
--- RELATORIO DO VENDEDOR ---
Nome: Ana
Total de vendas: R$ 40,00
Salario (30%): R$ 12,00
-----------------------------

---------------------------------------------------
TESTE UNITÁRIO 2:
Entrada:
Nome: Bruno
Quantos produtos foram vendidos por Bruno? 1
Produto 1 - preco unitario: 100
Produto 1 - quantidade vendida: 4
Deseja digitar os dados de mais um vendedor: n

Passo a passo:
Produto 1 -> totalVendas = 100 * 4 = 400
salario = 400 * 0.30 = 120

Saída esperada:
--- RELATORIO DO VENDEDOR ---
Nome: Bruno
Total de vendas: R$ 400,00
Salario (30%): R$ 120,00
-----------------------------

---------------------------------------------------
TESTE UNITÁRIO 3:
Entrada:
Nome: Carla
Quantos produtos foram vendidos por Carla? 3
Produto 1 - preco unitario: 20
Produto 1 - quantidade vendida: 2
Produto 2 - preco unitario: 15
Produto 2 - quantidade vendida: 1
Produto 3 - preco unitario: 10
Produto 3 - quantidade vendida: 3
Deseja digitar os dados de mais um vendedor: n

Passo a passo:
Produto 1 -> totalVendas = 20 * 2 = 40
Produto 2 -> totalVendas = 40 + (15 * 1) = 55
Produto 3 -> totalVendas = 55 + (10 * 3) = 85
salario = 85 * 0.30 = 25.50

Saída esperada:
--- RELATORIO DO VENDEDOR ---
Nome: Carla
Total de vendas: R$ 85,00
Salario (30%): R$ 25,50
-----------------------------
---------------------------------------------------
*/
