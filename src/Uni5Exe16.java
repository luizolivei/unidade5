import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaAlturas = 0.0;
        int quantidadePessoas = 0;
        double somaAlturasMulheres = 0.0;
        int quantidadeMulheres = 0;

        while (true) {
            double altura = scanner.nextDouble();
            if (altura == 0) {
                break;
            }
            String generoTexto = scanner.next();
            char genero = generoTexto.charAt(0);

            somaAlturas += altura;
            quantidadePessoas++;

            if (genero == 'F' || genero == 'f') {
                somaAlturasMulheres += altura;
                quantidadeMulheres++;
            }
        }

        if (quantidadeMulheres > 0) {
            double mediaMulheres = somaAlturasMulheres / quantidadeMulheres;
            System.out.printf("A media da altura das mulheres e: %.2f%n", mediaMulheres);
        } else {
            System.out.println("A media da altura das mulheres e: 0.00");
        }

        if (quantidadePessoas > 0) {
            double mediaGrupo = somaAlturas / quantidadePessoas;
            System.out.printf("A media de altura do grupo e: %.2f%n", mediaGrupo);
        } else {
            System.out.println("A media de altura do grupo e: 0.00");
        }

        scanner.close();
    }
}
// Teste de mesa 1: alturas 1.85 M 1.58 F 1.67 f 1.90 O 0 medias 1.62 e 1.75
// Teste de mesa 2: apenas homens resulta media mulheres 0 e grupo valor calculado
// Teste de mesa 3: nenhum dado altura 0 inicial medias 0
