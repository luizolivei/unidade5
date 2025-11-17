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

/*
Teste de Mesa 1:
Entrada:
tamanho = 4, pares posição/valor informados: (0,1.0),(1,2.0),(2,2.0),(3,3.0)

Passo a passo:
fillVector preenche vetor [1.0,2.0,2.0,3.0]
printFrequencyTable identifica valores únicos 1.0,2.0,3.0 com frequências 1,2,1

Saída:
Tabela com "Valor | Frequência" seguido das linhas "1.0 | 1", "2.0 | 2", "3.0 | 1"

---------------------------------------------------

Teste de Mesa 2:
Entrada:
tamanho = 3, pares = (0,5.5),(0,4.0),(1,4.0),(2,5.5)

Passo a passo:
Segunda tentativa para posição 0 é ignorada pois já preenchida
Vetor final = [5.5,4.0,5.5]
Frequências -> 5.5 ocorre 2 vezes, 4.0 ocorre 1 vez

Saída:
Linhas: "5.5 | 2" e "4.0 | 1"

---------------------------------------------------

Teste de Mesa 3:
Entrada:
tamanho = 2, pares = (1,7.2),(0,7.2)

Passo a passo:
fillVector resulta [7.2,7.2]
Somente um valor único -> frequência 2

Saída:
Tabela com linha única "7.2 | 2"
*/
