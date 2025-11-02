import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> elementos = new ArrayList<>();
        for (int valor = n; valor > 0; valor -= k) {
            elementos.add(valor);
        }

        List<Integer> dentro = new ArrayList<>();
        List<Integer> fora = new ArrayList<>();
        int somaDentro = 0;
        int somaFora = 0;

        for (int valor : elementos) {
            if (somaDentro + valor <= m) {
                dentro.add(valor);
                somaDentro += valor;
            } else {
                fora.add(valor);
                somaFora += valor;
            }
        }

        System.out.println("Elementos a serem colocados na mochila: " + elementos);
        System.out.println("Elementos que entraram na mochila: " + dentro);
        System.out.println("Elementos que ficaram fora da mochila: " + fora);
        System.out.println("Soma dos elementos que entraram na mochila: " + somaDentro);
        System.out.println("Soma dos elementos que nao entraram na mochila: " + somaFora);

        scanner.close();
    }
}
// Teste de mesa 1: N=10 K=2 M=15 elementos [10,8,6,4,2] dentro [10,4] fora [8,6,2]
// Teste de mesa 2: N=20 K=5 M=20 dentro [20] fora [15,10,5]
// Teste de mesa 3: N=9 K=3 M=50 dentro [9,6,3] fora []
