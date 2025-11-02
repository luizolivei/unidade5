import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double totalPescado = 0.0;
        boolean continuar = true;

        while (continuar) {
            double pesoGramas = scanner.nextDouble();
            totalPescado += pesoGramas / 1000.0;
            System.out.printf("Peso total acumulado: %.2f kg%n", totalPescado);
            if (totalPescado > limiteDiario) {
                System.out.println("Limite excedido");
                break;
            }
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        scanner.close();
    }
}
// Teste de mesa 1: limite 5kg peixes 1000g 2000g 2000g total 5kg continuar n nao excede
// Teste de mesa 2: limite 3kg peixes 2000g 1500g excede apos segunda leitura
// Teste de mesa 3: limite 2kg primeiro peixe 500g resposta n encerra
