import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
numeros = [10, 63, 4, 7, 2, ..., 9] (20 valores)

3 testes descritos aqui:
Iteração 1 -> numero = 10 -> 10 % 2 == 0 -> imprime "Par"
Iteração 2 -> numero = 63 -> 63 % 2 == 1 -> imprime "Ímpar"
Iteração 3 -> numero = 4 -> 4 % 2 == 0 -> imprime "Par"
*/
