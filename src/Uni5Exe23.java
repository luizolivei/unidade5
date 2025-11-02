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
// Teste de mesa 1: vendedor Ana 2 produtos (10*3 e 5*2) total 40 salario 12
// Teste de mesa 2: dois vendedores sequenciais respostas s e n
// Teste de mesa 3: resposta n apos primeiro encerra loop
