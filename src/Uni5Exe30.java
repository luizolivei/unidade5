import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> elementos = new ArrayList<>();
        for (int valor = n; valor > 0; valor -= k) {
            elementos.add(valor);
        }

        List<Integer> dentro = new ArrayList<>();
        List<Integer> fora = new ArrayList<>();
        int somaDentro = 0;
        int somaFora = 0;

        for (int valor : elementos) {
            if (somaDentro + valor <= m) {
                dentro.add(valor);
                somaDentro += valor;
            } else {
                fora.add(valor);
                somaFora += valor;
            }
        }

        System.out.println("Elementos a serem colocados na mochila: " + elementos);
        System.out.println("Elementos que entraram na mochila: " + dentro);
        System.out.println("Elementos que ficaram fora da mochila: " + fora);
        System.out.println("Soma dos elementos que entraram na mochila: " + somaDentro);
        System.out.println("Soma dos elementos que nao entraram na mochila: " + somaFora);

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
N = 10, K = 2, M = 15

Passo a passo:
Lista elementos: [10, 8, 6, 4, 2]
Adiciona 10 na mochila → somaDentro = 10
Próximo valor 8 → somaDentro + 8 = 18 > 15 → vai para fora
Valor 6 → somaDentro + 6 = 16 > 15 → fora
Valor 4 → somaDentro + 4 = 14 ≤ 15 → dentro
Valor 2 → somaDentro + 2 = 16 > 15 → fora
SomaDentro = 14, somaFora = 8 + 6 + 2 = 16

Saída:
Elementos a serem colocados na mochila: [10, 8, 6, 4, 2]
Elementos que entraram na mochila: [10, 4]
Elementos que ficaram fora da mochila: [8, 6, 2]
Soma dos elementos que entraram na mochila: 14
Soma dos elementos que nao entraram na mochila: 16

---------------------------------------------------

Teste de Mesa 2:
Entrada:
N = 20, K = 5, M = 20

Passo a passo:
Elementos gerados: [20, 15, 10, 5]
20 → entra → somaDentro = 20
Demais valores deixariam a soma maior que 20 → ficam fora

Saída:
Elementos a serem colocados na mochila: [20, 15, 10, 5]
Elementos que entraram na mochila: [20]
Elementos que ficaram fora da mochila: [15, 10, 5]
Soma dos elementos que entraram na mochila: 20
Soma dos elementos que nao entraram na mochila: 30

---------------------------------------------------

Teste de Mesa 3:
Entrada:
N = 9, K = 3, M = 50

Passo a passo:
Elementos: [9, 6, 3]
Adiciona 9 → somaDentro = 9
Adiciona 6 → somaDentro = 15
Adiciona 3 → somaDentro = 18 (permanece ≤ 50)
Nenhum elemento fica fora

Saída:
Elementos a serem colocados na mochila: [9, 6, 3]
Elementos que entraram na mochila: [9, 6, 3]
Elementos que ficaram fora da mochila: []
Soma dos elementos que entraram na mochila: 18
Soma dos elementos que nao entraram na mochila: 0
*/
