import java.util.Scanner;

public class Uni6Exe09 {
    private static final int PEOPLE = 30;

    public static void main(String[] args) {
        new Uni6Exe09().run();
    }

    private void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] genders = new int[PEOPLE];
            int[] ratings = new int[PEOPLE];
            int[] ages = new int[PEOPLE];

            readData(scanner, genders, ratings, ages);

            double averageRating = calculateAverage(ratings);
            double averageMaleRating = calculateAverageByGender(genders, ratings, 2);
            Integer youngestWomanRating = findYoungestWomanRating(genders, ratings, ages);
            int olderWomenAboveAverage = countOlderWomenAboveAverage(genders, ratings, ages, averageRating);

            System.out.printf("Nota média do cinema: %.2f%n", averageRating);
            if (Double.isNaN(averageMaleRating)) {
                System.out.println("Nenhum homem respondeu.");
            } else {
                System.out.printf("Nota média atribuída pelos homens: %.2f%n", averageMaleRating);
            }
            if (youngestWomanRating == null) {
                System.out.println("Nenhuma mulher respondeu.");
            } else {
                System.out.println("Nota atribuída pela mulher mais jovem: " + youngestWomanRating);
            }
            System.out.println("Mulheres com mais de 50 anos que deram nota acima da média: " + olderWomenAboveAverage);
        }
    }

    private void readData(Scanner scanner, int[] genders, int[] ratings, int[] ages) {
        for (int i = 0; i < PEOPLE; i++) {
            genders[i] = scanner.nextInt();
            ratings[i] = scanner.nextInt();
            ages[i] = scanner.nextInt();
        }
    }

    private double calculateAverage(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum / (double) values.length;
    }

    private double calculateAverageByGender(int[] genders, int[] ratings, int targetGender) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < genders.length; i++) {
            if (genders[i] == targetGender) {
                sum += ratings[i];
                count++;
            }
        }
        if (count == 0) {
            return Double.NaN;
        }
        return sum / (double) count;
    }

    private Integer findYoungestWomanRating(int[] genders, int[] ratings, int[] ages) {
        Integer rating = null;
        int youngestAge = Integer.MAX_VALUE;
        for (int i = 0; i < genders.length; i++) {
            if (genders[i] == 1 && ages[i] < youngestAge) {
                youngestAge = ages[i];
                rating = ratings[i];
            }
        }
        return rating;
    }

    private int countOlderWomenAboveAverage(int[] genders, int[] ratings, int[] ages, double averageRating) {
        int count = 0;
        for (int i = 0; i < genders.length; i++) {
            if (genders[i] == 1 && ages[i] > 50 && ratings[i] > averageRating) {
                count++;
            }
        }
        return count;
    }
}

/*
Teste de Mesa 1:
Entrada:
3 pessoas (exemplo reduzido) -> gêneros = [1,2,1], notas = [6,8,10], idades = [25,30,60]

Passo a passo:
Média geral = (6+8+10)/3 = 8
Média homens (2) = apenas nota 8 -> média 8
Mulher mais jovem tem 25 anos -> nota 6
Mulheres >50 e nota>8 -> apenas a de 60 anos nota 10 -> 1 caso

Saída:
"Nota média do cinema: 8.00"
"Nota média atribuída pelos homens: 8.00"
"Nota atribuída pela mulher mais jovem: 6"
"Mulheres com mais de 50 anos...: 1"

---------------------------------------------------

Teste de Mesa 2:
Entrada:
gêneros = [2,2,2], notas = [4,5,6], idades = [20,25,30]

Passo a passo:
Média geral = 5
Não há mulheres -> mensagens "Nenhuma mulher respondeu." e contagem 0
Média homens = 5

Saída:
Média geral 5.00, média homens 5.00, "Nenhuma mulher respondeu." e "Mulheres...: 0"

---------------------------------------------------

Teste de Mesa 3:
Entrada:
gêneros = [1,1,1], notas = [7,9,5], idades = [40,55,35]

Passo a passo:
Média geral = 7
Nenhum homem respondeu -> mensagem correspondente
Mulher mais jovem = 35 anos -> nota 5
Mulheres >50 com nota>7 -> somente idade 55 nota 9 -> contagem 1

Saída:
Imprime média 7.00, "Nenhum homem respondeu.", "Nota ...: 5", "Mulheres ...: 1"
*/
