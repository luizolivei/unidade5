import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            String nome = scanner.next();
            int produtos = scanner.nextInt();
            double totalVendas = 0.0;

            for (int i = 1; i <= produtos; i++) {
                double preco = scanner.nextDouble();
                int quantidade = scanner.nextInt();
                totalVendas += preco * quantidade;
            }

            double salario = totalVendas * 0.3;

            System.out.println("Nome: " + nome);
            System.out.printf("Total de vendas: R$%.2f%n", totalVendas);
            System.out.printf("Salario: R$%.2f%n", salario);

            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
"Ana" 2 → (10.00, 3) (5.00, 2) → "n"

Passo a passo:
Produto 1 → totalVendas += 10 * 3 = 30
Produto 2 → totalVendas += 5 * 2 = 10 → totalVendas = 40
salario = 40 * 0.3 = 12
Resposta "n" encerra o laço

Saída:
Nome: Ana
Total de vendas: R$40.00
Salario: R$12.00

---------------------------------------------------

Teste de Mesa 2:
Entrada:
"Bruno" 1 → (50.00, 1) → "s" → "Carla" 2 → (20.00, 2) (15.00, 1) → "n"

Passo a passo:
Bruno → totalVendas = 50 → salario = 15 → resposta "s" continua
Carla → totalVendas = 20*2 + 15*1 = 55 → salario = 16.50 → resposta "n" encerra

Saída:
Nome: Bruno
Total de vendas: R$50.00
Salario: R$15.00
Nome: Carla
Total de vendas: R$55.00
Salario: R$16.50

---------------------------------------------------

Teste de Mesa 3:
Entrada:
"Diego" 0 → "n"

Passo a passo:
Como produtos = 0 → o laço interno não soma nada → totalVendas = 0
salario = 0 * 0.3 = 0 → resposta "n" encerra

Saída:
Nome: Diego
Total de vendas: R$0.00
Salario: R$0.00
*/
