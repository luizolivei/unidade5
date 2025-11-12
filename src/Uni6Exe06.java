import java.util.Scanner;

public class Uni6Exe06 {

    public static void main(String[] args) {
        new Uni6Exe06().run();
    }

    private void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            int size = scanner.nextInt();
            double[] values = readVector(scanner, size);
            double target = scanner.nextDouble();
            boolean found = containsValue(values, target);
            System.out.println(found ? "Valor encontrado." : "Valor não encontrado.");
        }
    }

    private double[] readVector(Scanner scanner, int size) {
        double[] values = new double[size];
        for (int i = 0; i < size; i++) {
            values[i] = scanner.nextDouble();
        }
        return values;
    }

    private boolean containsValue(double[] values, double target) {
        for (double value : values) {
            if (Double.compare(value, target) == 0) {
                return true;
            }
        }
        return false;
    }
}
