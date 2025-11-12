import java.util.Scanner;

public class Uni6Exe03 {
    private static final int SIZE = 12;

    public static void main(String[] args) {
        new Uni6Exe03().run();
    }

    private void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] values = readValues(scanner);
            adjustValues(values);
            printValues(values);
        }
    }

    private double[] readValues(Scanner scanner) {
        double[] values = new double[SIZE];
        for (int i = 0; i < SIZE; i++) {
            values[i] = scanner.nextDouble();
        }
        return values;
    }

    private void adjustValues(double[] values) {
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0) {
                values[i] *= 1.05;
            } else {
                values[i] *= 1.02;
            }
        }
    }

    private void printValues(double[] values) {
        for (double value : values) {
            System.out.println(value);
        }
    }
}
