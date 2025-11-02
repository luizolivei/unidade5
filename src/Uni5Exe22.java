import java.util.Scanner;

public class Uni5Exe22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int anoAtual = scanner.nextInt();
        double salario = 2000.0;

        if (anoAtual >= 1996) {
            double percentual = 0.015;
            salario += salario * percentual;
            for (int ano = 1997; ano <= anoAtual; ano++) {
                percentual *= 2.0;
                salario += salario * percentual;
            }
        }

        System.out.printf("Salario em %d: R$%.2f%n", anoAtual, salario);

        scanner.close();
    }
}
// Teste de mesa 1: ano 1996 salario 2000 +1.5% = 2030
// Teste de mesa 2: ano 1997 aplica aumentos 1.5% e depois 3% sobre novo salario
// Teste de mesa 3: ano 1995 permanece 2000
