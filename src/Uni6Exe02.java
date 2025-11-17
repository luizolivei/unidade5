import java.util.Scanner;

public class Uni6Exe02 {
    private static final int SIZE = 12;

    public static void main(String[] args) {
        new Uni6Exe02().run();
    }

    private void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] values = readValues(scanner);
            double average = calculateAverage(values);
            printGreaterThanAverage(values, average);
        }
    }

    private double[] readValues(Scanner scanner) {
        double[] values = new double[SIZE];
        for (int i = 0; i < SIZE; i++) {
            values[i] = scanner.nextDouble();
        }
        return values;
    }

    private double calculateAverage(double[] values) {
        double sum = 0.0;
        for (double value : values) {
            sum += value;
        }
        return sum / values.length;
    }

    private void printGreaterThanAverage(double[] values, double average) {
        for (double value : values) {
            if (value > average) {
                System.out.println(value);
            }
        }
    }
}

/*
Teste de Mesa 1:
Entrada:
Valores = [10,20,30,40,50,60,70,80,90,100,110,120]

Passo a passo:
Soma = 780 -> média = 65
printGreaterThanAverage imprime números >65 -> 70 a 120

Saída:
Linhas com 70,80,90,100,110,120

---------------------------------------------------

Teste de Mesa 2:
Entrada:
Valores = [5,5,5,5,5,5,5,5,5,5,5,5]

Passo a passo:
Soma = 60 -> média = 5
Nenhum valor é maior que a média

Saída:
Nada é impresso

---------------------------------------------------

Teste de Mesa 3:
Entrada:
Valores = [2,4,6,8,10,12,14,16,18,20,22,24]

Passo a passo:
Soma = 156 -> média = 13
Valores maiores que 13: 14,16,18,20,22,24

Saída:
Impressão das seis últimas posições
*/
