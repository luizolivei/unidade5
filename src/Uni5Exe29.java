import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int[] cedulas = {20, 10, 5, 2, 1};
        int restante = valor;

        for (int cedula : cedulas) {
            int quantidade = restante / cedula;
            if (quantidade > 0) {
                System.out.println(quantidade + " cedula(s) de " + cedula);
                restante %= cedula;
            }
        }

        scanner.close();
    }
}
// Teste de mesa 1: valor 6 resulta 1 cedula de 5 e 1 de 1
// Teste de mesa 2: valor 47 resulta 2 de 20 1 de 5 1 de 2
// Teste de mesa 3: valor 3 resulta 1 de 2 e 1 de 1
