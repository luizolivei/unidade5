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
