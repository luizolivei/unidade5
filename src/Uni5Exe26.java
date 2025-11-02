import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pedagioMaximo = scanner.nextDouble();
        int trechosInformados = 0;
        int trechosAcimaLimite = 0;
        int trechosAceitosAcima150 = 0;

        while (true) {
            double valorPedagio = scanner.nextDouble();
            if (valorPedagio < 0) {
                break;
            }
            double distancia = scanner.nextDouble();
            trechosInformados++;
            if (valorPedagio > pedagioMaximo) {
                trechosAcimaLimite++;
            }
            if (distancia > 150 && valorPedagio <= pedagioMaximo) {
                trechosAceitosAcima150++;
            }
        }

        System.out.println(trechosAcimaLimite);
        System.out.println(trechosInformados);
        System.out.println(trechosAceitosAcima150);

        scanner.close();
    }
}
// Teste de mesa 1: exemplo fornecido gera 3 6 2
// Teste de mesa 2: todos pedagios abaixo limite contam na terceira estatistica
// Teste de mesa 3: primeiro pedagio negativo encerra e resultados zerados
