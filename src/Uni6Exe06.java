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

/*
Teste de Mesa 1:
Entrada:
tamanho = 4, valores = [1.5,3.0,4.5,6.0], alvo = 4.5

Passo a passo:
containsValue percorre vetor -> encontra 4.5 na posição 2 -> retorna true

Saída:
"Valor encontrado."

---------------------------------------------------

Teste de Mesa 2:
Entrada:
tamanho = 3, valores = [10,20,30], alvo = 25

Passo a passo:
Nenhuma posição corresponde -> método devolve false

Saída:
"Valor não encontrado."

---------------------------------------------------

Teste de Mesa 3:
Entrada:
tamanho = 5, valores = [0,0,0,0,0], alvo = 0

Passo a passo:
Primeiro elemento já satisfaz Double.compare == 0 -> retorna true

Saída:
"Valor encontrado."
*/
