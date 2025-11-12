import java.util.Scanner;

public class Uni6Exe08 {
    private static final int LIMIT = 20;

    public static void main(String[] args) {
        new Uni6Exe08().run();
    }

    private void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = readSize(scanner);
            double[] values = fillVector(scanner, size);
            printFrequencyTable(values);
        }
    }

    private int readSize(Scanner scanner) {
        int size = scanner.nextInt();
        if (size < 0) {
            size = 0;
        } else if (size > LIMIT) {
            size = LIMIT;
        }
        return size;
    }

    private double[] fillVector(Scanner scanner, int size) {
        double[] values = new double[size];
        boolean[] filled = new boolean[size];
        int filledCount = 0;
        while (filledCount < size) {
            int position = scanner.nextInt();
            double value = scanner.nextDouble();
            if (position >= 0 && position < size && !filled[position]) {
                values[position] = value;
                filled[position] = true;
                filledCount++;
            }
        }
        return values;
    }

    private void printFrequencyTable(double[] values) {
        double[] uniqueValues = new double[values.length];
        int[] counts = new int[values.length];
        int uniqueCount = 0;

        for (double value : values) {
            int index = findIndex(uniqueValues, uniqueCount, value);
            if (index == -1) {
                uniqueValues[uniqueCount] = value;
                counts[uniqueCount] = 1;
                uniqueCount++;
            } else {
                counts[index]++;
            }
        }

        System.out.println("Valor | Frequência");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.println(uniqueValues[i] + " | " + counts[i]);
        }
    }

    private int findIndex(double[] values, int length, double target) {
        for (int i = 0; i < length; i++) {
            if (Double.compare(values[i], target) == 0) {
                return i;
            }
        }
        return -1;
    }
}
