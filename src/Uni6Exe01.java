import java.util.Scanner;

public class Uni6Exe01 {
    private static final int SIZE = 10;

    public static void main(String[] args) {
        new Uni6Exe01().run();
    }

    private void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = readValues(scanner);
            printReverse(values);
        }
    }

    private int[] readValues(Scanner scanner) {
        int[] values = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    private void printReverse(int[] values) {
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.println(values[i]);
        }
    }
}
