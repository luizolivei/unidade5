import java.util.Scanner;

public class Uni6Exe10 {
    private static final int CAPACITY = 50;

    public static void main(String[] args) {
        new Uni6Exe10().run();
    }

    private void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = new int[CAPACITY];
            int size = 0;
            int option;
            do {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        size = includeValue(scanner, values, size);
                        break;
                    case 2:
                        searchValue(scanner, values, size);
                        break;
                    case 3:
                        alterValue(scanner, values, size);
                        break;
                    case 4:
                        size = deleteValue(scanner, values, size);
                        break;
                    case 5:
                        showValues(values, size);
                        break;
                    case 6:
                        sortValues(values, size);
                        break;
                    case 7:
                        invertValues(values, size);
                        break;
                    case 8:
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (option != 8);
        }
    }

    private int includeValue(Scanner scanner, int[] values, int size) {
        if (size >= CAPACITY) {
            System.out.println("Vetor cheio. Valor não incluído.");
            return size;
        }
        int value = scanner.nextInt();
        values[size] = value;
        System.out.println("Valor incluído.");
        return size + 1;
    }

    private void searchValue(Scanner scanner, int[] values, int size) {
        int value = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (values[i] == value) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "Valor encontrado." : "Valor não encontrado.");
    }

    private void alterValue(Scanner scanner, int[] values, int size) {
        int target = scanner.nextInt();
        int newValue = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (values[i] == target) {
                values[i] = newValue;
                System.out.println("Valor alterado.");
                return;
            }
        }
        System.out.println("Número não encontrado.");
    }

    private int deleteValue(Scanner scanner, int[] values, int size) {
        int target = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (values[i] == target) {
                for (int j = i; j < size - 1; j++) {
                    values[j] = values[j + 1];
                }
                System.out.println("Valor excluído.");
                return size - 1;
            }
        }
        System.out.println("Valor não encontrado.");
        return size;
    }

    private void showValues(int[] values, int size) {
        for (int i = 0; i < size; i++) {
            System.out.println(values[i]);
        }
    }

    private void sortValues(int[] values, int size) {
        boolean swapped;
        int n = size;
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
        System.out.println("Valores ordenados.");
    }

    private void invertValues(int[] values, int size) {
        for (int i = 0; i < size / 2; i++) {
            int temp = values[i];
            values[i] = values[size - 1 - i];
            values[size - 1 - i] = temp;
        }
        System.out.println("Valores invertidos.");
    }
}
