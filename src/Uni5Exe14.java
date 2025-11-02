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
// Teste de mesa 1: 20 mercadorias com lucro 5% caem na primeira categoria
// Teste de mesa 2: mercadorias com lucro 15% contam na segunda
// Teste de mesa 3: mercadorias com lucro 30% contam na terceira
