import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lucroMenorQueDez = 0;
        int lucroEntreDezEVinte = 0;
        int lucroMaiorQueVinte = 0;
        double totalCompra = 0.0;
        double totalVenda = 0.0;

        for (int i = 0; i < 20; i++) {
            String nome = scanner.next();
            double precoCompra = scanner.nextDouble();
            double precoVenda = scanner.nextDouble();

            double percentualLucro = ((precoVenda - precoCompra) / precoCompra) * 100.0;

            if (percentualLucro < 10.0) {
                lucroMenorQueDez++;
            } else if (percentualLucro <= 20.0) {
                lucroEntreDezEVinte++;
            } else {
                lucroMaiorQueVinte++;
            }

            totalCompra += precoCompra;
            totalVenda += precoVenda;
        }

        double lucroTotal = totalVenda - totalCompra;

        System.out.println("Lucro < 10%: " + lucroMenorQueDez);
        System.out.println("10% <= lucro <= 20%: " + lucroEntreDezEVinte);
        System.out.println("Lucro > 20%: " + lucroMaiorQueVinte);
        System.out.printf("Valor total de compra: %.2f%n", totalCompra);
        System.out.printf("Valor total de venda: %.2f%n", totalVenda);
        System.out.printf("Lucro total: %.2f%n", lucroTotal);

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
20 mercadorias com precoCompra = 100.00 e precoVenda = 105.00

Passo a passo:
percentualLucro = (105 - 100) / 100 * 100 = 5%
Cada item incrementa lucroMenorQueDez -> ao final lucroMenorQueDez = 20
totalCompra = 2000.00 -> totalVenda = 2100.00 -> lucroTotal = 100.00

Saída:
Lucro < 10%: 20
10% <= lucro <= 20%: 0
Lucro > 20%: 0
Valor total de compra: 2000.00
Valor total de venda: 2100.00
Lucro total: 100.00

---------------------------------------------------

Teste de Mesa 2:
Entrada:
20 mercadorias com precoCompra = 100.00 e precoVenda = 115.00

Passo a passo:
percentualLucro = 15% -> cada item incrementa lucroEntreDezEVinte
totalCompra = 2000.00 -> totalVenda = 2300.00 -> lucroTotal = 300.00

Saída:
Lucro < 10%: 0
10% <= lucro <= 20%: 20
Lucro > 20%: 0
Valor total de compra: 2000.00
Valor total de venda: 2300.00
Lucro total: 300.00

---------------------------------------------------

Teste de Mesa 3:
Entrada:
20 mercadorias com precoCompra = 50.00 e precoVenda = 70.00

Passo a passo:
percentualLucro = 40% -> contador lucroMaiorQueVinte recebe +1 a cada mercadoria
totalCompra = 1000.00 -> totalVenda = 1400.00 -> lucroTotal = 400.00

Saída:
Lucro < 10%: 0
10% <= lucro <= 20%: 0
Lucro > 20%: 20
Valor total de compra: 1000.00
Valor total de venda: 1400.00
Lucro total: 400.00
*/
