import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 0; i < quantidade; i++) {
            double numero = scanner.nextDouble();
            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.printf("Maior numero: %.2f%n", maior);
        System.out.printf("Menor numero: %.2f%n", menor);

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
quantidade = 3
valores = [1.00, 5.00, 2.00]

Passo a passo:
Iteração 1 → numero = 1.00 → maior = 1.00, menor = 1.00
Iteração 2 → numero = 5.00 → maior atualizado para 5.00, menor continua 1.00
Iteração 3 → numero = 2.00 → maior permanece 5.00, menor permanece 1.00

Saída:
Maior numero: 5.00
Menor numero: 1.00

---------------------------------------------------

Teste de Mesa 2:
Entrada:
quantidade = 1
valores = [7.50]

Passo a passo:
Iteração única → numero = 7.50 → maior e menor recebem 7.50

Saída:
Maior numero: 7.50
Menor numero: 7.50

---------------------------------------------------

Teste de Mesa 3:
Entrada:
quantidade = 4
valores = [-1.00, -5.00, -2.00, -3.00]

Passo a passo:
Iteração 1 → maior = -1.00, menor = -1.00
Iteração 2 → numero = -5.00 → menor atualizado para -5.00
Iteração 3 → numero = -2.00 → maior permanece -1.00, menor -5.00
Iteração 4 → numero = -3.00 → variáveis não se alteram

Saída:
Maior numero: -1.00
Menor numero: -5.00
*/
