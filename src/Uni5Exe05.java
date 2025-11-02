import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        while (quantidade <= 2) {
            quantidade = scanner.nextInt();
        }

        int base = 8;
        int gerados = 0;

        while (gerados < quantidade) {
            System.out.println(base);
            gerados++;
            if (gerados < quantidade) {
                System.out.println(base + 2);
                gerados++;
            }
            base *= 2;
        }

        scanner.close();
    }
}
// Teste de mesa 1: n=4 saída 8 10 16 18
// Teste de mesa 2: n=5 saída 8 10 16 18 32
// Teste de mesa 3: n=6 saída 8 10 16 18 32 34
