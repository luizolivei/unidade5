import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaAlturas = 0.0;

        for (int i = 0; i < 20; i++) {
            double altura = scanner.nextDouble();
            somaAlturas += altura;
        }

        double media = somaAlturas / 20.0;
        System.out.printf("A media das alturas e: %.2f%n", media);

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
alturas = [1.80 repetido 20 vezes]

Passo a passo:
Cada leitura somaAlturas += 1.80 -> após 20 leituras somaAlturas = 36.00
media = 36.00 / 20 -> media = 1.80

Saída:
A media das alturas e: 1.80

---------------------------------------------------

Teste de Mesa 2:
Entrada:
alturas = [1,60, 1,80, 1,60, 1,80, ..., (20 vezes esse mesmo fluxo...)]

Passo a passo:
Leituras ímpares -> somaAlturas adiciona 1.60
Leituras pares -> somaAlturas adiciona 1.80
Ao final -> somaAlturas = 34.00 -> media = 34.00 / 20 = 1.70

Saída:
A media das alturas e: 1.70

---------------------------------------------------

Teste de Mesa 3:
Entrada:
alturas = [2.00 repetido 20 vezes]

Passo a passo:
Cada leitura adiciona 2.00 -> somaAlturas = 40.00
media = 40.00 / 20 = 2.00

Saída:
A media das alturas e: 2.00
*/
