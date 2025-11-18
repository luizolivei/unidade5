import java.util.Scanner;

public class Uni6Exe03 {
    private static final int SIZE = 12;

    public static void main(String[] args) {
        new Uni6Exe03().run();
    }

    private void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            double[] values = readValues(scanner);
            adjustValues(values);
            printValues(values);
        }
    }

    private double[] readValues(Scanner scanner) {
        double[] values = new double[SIZE];
        for (int i = 0; i < SIZE; i++) {
            values[i] = scanner.nextDouble();
        }
        return values;
    }

    private void adjustValues(double[] values) {
        for (int i = 0; i < values.length; i++) {
            if (i % 2 == 0) {
                values[i] *= 1.05;
            } else {
                values[i] *= 1.02;
            }
        }
    }

    private void printValues(double[] values) {
        for (double value : values) {
            System.out.println(value);
        }
    }
}

/*
Teste de Mesa 1:
Entrada:
Valores = [100,100,100,100,100,100,100,100,100,100,100,100]

Passo a passo:
Índices pares multiplicados por 1,05 -> 105
Ímpares multiplicados por 1,02 -> 102

Saída:
Sequência alternando 105 e 102

---------------------------------------------------

Teste de Mesa 2:
Entrada:
Valores = [10,20,30,40,50,60,70,80,90,100,110,120]

Passo a passo:
Aplicam-se os reajustes individuais (ex.: posição0 = 10*1,05=10,5; posição1 = 20*1,02=20,4)

Saída:
Doze linhas com os valores reajustados (10,5; 20,4; 31,5; 40,8; ...; 115,5; 122,4)

---------------------------------------------------

Teste de Mesa 3:
Entrada:
Valores = [0,50,0,50,0,50,0,50,0,50,0,50]

Passo a passo:
Indices pares permanecem 0 (0*1,05 = 0)
Ímpares sobem para 51 (50*1,02)

Saída:
Vetor impresso como [0,51,0,51,...]
*/
