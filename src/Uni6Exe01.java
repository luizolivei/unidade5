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

/*
Teste de Mesa 1:
Entrada:
Valores lidos = [1,2,3,4,5,6,7,8,9,10]

Passo a passo:
readValues preenche vetor nessa ordem
printReverse imprime do índice 9 ao 0 -> sequência: 10,9,...,1

Saída:
Linhas exibindo 10 até 1

---------------------------------------------------

Teste de Mesa 2:
Entrada:
Valores = [5,5,5,5,5,5,5,5,5,5]

Passo a passo:
Vetor preenchido com 5 em todas posições
printReverse percorre e imprime 5 em cada iteração

Saída:
Dez linhas com "5"

---------------------------------------------------

Teste de Mesa 3:
Entrada:
Valores = [0,-1,-2,-3,-4,-5,-6,-7,-8,-9]

Passo a passo:
Leitura guarda números negativos
Ao inverter, saída é [-9,-8,-7,-6,-5,-4,-3,-2,-1,0]

Saída:
Sequência impressa: -9 a 0 crescente
*/
