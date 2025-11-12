import java.util.Scanner;

public class Uni6Exe04 {
    private static final int SIZE = 10;

    public static void main(String[] args) {
        new Uni6Exe04().run();
    }

    private void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] vector1 = readVector(scanner);
            int[] vector2 = readVector(scanner);
            int[] sumVector = sumVectors(vector1, vector2);
            printVector(vector1);
            printVector(vector2);
            printVector(sumVector);
        }
    }

    private int[] readVector(Scanner scanner) {
        int[] vector = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            vector[i] = scanner.nextInt();
        }
        return vector;
    }

    private int[] sumVectors(int[] vector1, int[] vector2) {
        int[] result = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            result[i] = vector1[i] + vector2[i];
        }
        return result;
    }

    private void printVector(int[] vector) {
        for (int value : vector) {
            System.out.println(value);
        }
        System.out.println();
    }
}
