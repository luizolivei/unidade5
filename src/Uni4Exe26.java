import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a opção (T=Triângulo, Q=Quadrado, R=Retângulo, C=Círculo): ");
        char opcao = scanner.next().toUpperCase().charAt(0);
        double area;

        switch (opcao) {
            case 'T':
                System.out.print("Digite a base do triângulo: ");
                double baseT = scanner.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                double alturaT = scanner.nextDouble();
                area = (baseT * alturaT) / 2;
                System.out.printf("Área do triângulo: %.2f%n", area);
                break;

            case 'Q':
                System.out.print("Digite o lado do quadrado: ");
                double ladoQ = scanner.nextDouble();
                area = ladoQ * ladoQ;
                System.out.printf("Área do quadrado: %.2f%n", area);

                break;

            case 'R':
                System.out.print("Digite a base do retângulo: ");
                double baseR = scanner.nextDouble();
                System.out.print("Digite a altura do retângulo: ");
                double alturaR = scanner.nextDouble();
                area = baseR * alturaR;
                System.out.printf("Área do retângulo: %.2f%n", area);
                break;

            case 'C':
                System.out.print("Digite o raio do círculo: ");
                double raioC = scanner.nextDouble();
                area = Math.PI * raioC * raioC;
                System.out.printf("Área do círculo: %.2f%n", area);

                break;

            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}

/*
Teste de Mesa 1:
Entrada:
opcao = 'T'
baseT = 5
alturaT = 4

Passo a passo:
case 'T' → verdadeiro
area = (5 * 4) / 2 = 20 / 2 = 10
Imprime: "Área do triângulo: 10.00"

Saída esperada:
Área do triângulo: 10.00

---------------------------------------------------

Teste de Mesa 2:
Entrada:
opcao = 'Q'
ladoQ = 6

Passo a passo:
case 'Q' → verdadeiro
area = 6 * 6 = 36
Imprime: "Área do quadrado: 36.00"

Saída esperada:
Área do quadrado: 36.00

---------------------------------------------------

Teste de Mesa 3:
Entrada:
opcao = 'C'
raioC = 3

Passo a passo:
case 'C' → verdadeiro
area = π * 3^2 = 3.14159 * 9 ≈ 28.27
Imprime: "Área do círculo: 28.27"

Saída esperada:
Área do círculo: 28.27
*/
