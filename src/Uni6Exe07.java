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

/*
Teste de Mesa 1:
Entrada:
tamanho informado = 5, valores digitados = [4,2,5,1,3]

Passo a passo:
readSize retorna 5
readUniqueValues aceita os 5 números (todos diferentes)
bubbleSort ordena para [1,2,3,4,5]

Saída:
Números impressos em ordem crescente

---------------------------------------------------

Teste de Mesa 2:
Entrada:
tamanho = 3, valores digitados = [7,7,8,9] (segunda leitura repete número)

Passo a passo:
readUniqueValues ignora o segundo 7, solicitando novo valor até preencher 3 posições
Vetor final = [7,8,9] -> ordenação mantém igual

Saída:
7,8,9 (um por linha)

---------------------------------------------------

Teste de Mesa 3:
Entrada:
tamanho = 25 (acima do limite), valores únicos 1..20

Passo a passo:
readSize limita tamanho a 20
Após leitura e ordenação, saída é 1..20

Saída:
Linhas com números de 1 a 20
*/
