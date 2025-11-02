import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String nome = scanner.next();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();
            double media = (nota1 + nota2) / 2.0;
            System.out.printf("A media do(a) %s e %.2f%n", nome, media);
        }

        scanner.close();
    }
}
// Teste de mesa 1: entradas Maria 6 10 e João 4 8 final fim
// Teste de mesa 2: entrada único aluno Ana 7 7 final fim
// Teste de mesa 3: entrada fim direto sem alunos
