import java.util.Scanner;

public class Uni6Exe07 {
    private static final int LIMIT = 20;

    public static void main(String[] args) {
        new Uni6Exe07().run();
    }

    private void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = readSize(scanner);
            int[] values = readUniqueValues(scanner, size);
            bubbleSort(values);
            printVector(values);
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

    private int[] readUniqueValues(Scanner scanner, int size) {
        int[] values = new int[size];
        int index = 0;
        while (index < size) {
            int value = scanner.nextInt();
            if (!contains(values, index, value)) {
                values[index] = value;
                index++;
            }
        }
        return values;
    }

    private boolean contains(int[] values, int length, int target) {
        for (int i = 0; i < length; i++) {
            if (values[i] == target) {
                return true;
            }
        }
        return false;
    }

    private void bubbleSort(int[] values) {
        boolean swapped;
        int n = values.length;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (values[i] > values[i + 1]) {
                    int temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }

    private void printVector(int[] values) {
        for (int value : values) {
            System.out.println(value);
        }
    }
}
