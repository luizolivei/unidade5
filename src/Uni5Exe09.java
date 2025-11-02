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
/*
Teste de Mesa 1:
Entrada:
quantidade = 5
alunos = [("Maria", 18), ("Joana", 26), ("Marcos", 30), ("Pedro", 18), ("Carla", 21)]

Passo a passo:
Aluno 1 -> idade 18 -> nomesComDezoito = "Maria" -> acimaVinte continua 0
Aluno 2 -> idade 26 -> nomesComDezoito não muda -> acimaVinte = 1
Aluno 3 -> idade 30 -> acimaVinte = 2
Aluno 4 -> idade 18 -> nomesComDezoito = "Maria, Pedro"
Aluno 5 -> idade 21 -> acimaVinte = 3

Saída:
Nomes dos alunos que tem 18 anos: Maria, Pedro
Quantidade de alunos que tem idade acima de 20 anos: 3

---------------------------------------------------

Teste de Mesa 2:
Entrada:
quantidade = 3
alunos = [("Ana", 17), ("Bia", 16), ("Lucas", 17)]

Passo a passo:
Nenhum aluno com 18 anos -> nomesComDezoito permanece vazio
Todas as idades são menores que 20 -> acimaVinte = 0

Saída:
Nomes dos alunos que tem 18 anos: nenhum
Quantidade de alunos que tem idade acima de 20 anos: 0

---------------------------------------------------

Teste de Mesa 3:
Entrada:
quantidade = 4
alunos = [("João", 18), ("Manoela", 18), ("Lucas", 18), ("Marquinho", 18)]

Passo a passo:
Cada aluno tem 18 anos -> nomesComDezoito recebe todos os nomes separados por vírgula
Nenhuma idade é maior que 20 -> acimaVinte = 0

Saída:
Nomes dos alunos que tem 18 anos: João, Manoela, Lucas, Marquinho
Quantidade de alunos que tem idade acima de 20 anos: 0
*/
