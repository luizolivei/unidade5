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

/*
Teste de Mesa 1:
Entrada:
Vetor1 = [1,1,1,1,1,1,1,1,1,1]
Vetor2 = [2,2,2,2,2,2,2,2,2,2]

Passo a passo:
sumVectors gera [3,3,...,3]
printVector exibe vetor1, vetor2 e vetor soma (cada um seguido de linha em branco)

Saída:
Linhas com dez 1s, linha em branco, dez 2s, linha em branco, dez 3s

---------------------------------------------------

Teste de Mesa 2:
Entrada:
Vetor1 = [0,1,2,3,4,5,6,7,8,9]
Vetor2 = [9,8,7,6,5,4,3,2,1,0]

Passo a passo:
Somas posição a posição resultam sempre 9

Saída:
Primeiro vetor crescente, segundo decrescente, terceiro somente 9s

---------------------------------------------------

Teste de Mesa 3:
Entrada:
Vetor1 = [-5,-4,-3,-2,-1,0,1,2,3,4]
Vetor2 = [5,4,3,2,1,0,-1,-2,-3,-4]

Passo a passo:
Soma em cada índice = 0

Saída:
Terceiro vetor impresso com zeros
*/
