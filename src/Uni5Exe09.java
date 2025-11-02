import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidade = scanner.nextInt();
        StringBuilder nomesComDezoito = new StringBuilder();
        int acimaVinte = 0;

        for (int i = 0; i < quantidade; i++) {
            String nome = scanner.next();
            int idade = scanner.nextInt();

            if (idade == 18) {
                if (nomesComDezoito.length() > 0) {
                    nomesComDezoito.append(", ");
                }
                nomesComDezoito.append(nome);
            }

            if (idade > 20) {
                acimaVinte++;
            }
        }

        if (nomesComDezoito.length() == 0) {
            System.out.println("Nomes dos alunos que tem 18 anos: nenhum");
        } else {
            System.out.println("Nomes dos alunos que tem 18 anos: " + nomesComDezoito);
        }
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: " + acimaVinte);

        scanner.close();
    }
}
// Teste de mesa 1: nomes Maria18 Joana26 Marcos30 Pedro18 Carla21 resultado Maria, Pedro e contagem 3
// Teste de mesa 2: todos menores de 18 resultado nenhum e contagem 0
// Teste de mesa 3: todos iguais a 18 resultado lista completa e contagem 0
