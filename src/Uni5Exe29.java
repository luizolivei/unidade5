import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor = scanner.nextInt();
        int[] cedulas = {20, 10, 5, 2, 1};
        int restante = valor;

        for (int cedula : cedulas) {
            int quantidade = restante / cedula;
            if (quantidade > 0) {
                System.out.println(quantidade + " cedula(s) de " + cedula);
                restante %= cedula;
            }
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
valor = 6

Passo a passo:
cedula 20 -> quantidade = 0 -> resto continua 6
cedula 10 -> quantidade = 0 -> resto continua 6
cedula 5 -> quantidade = 1 -> imprime "1 cedula(s) de 5" -> restante = 1
cedula 2 -> quantidade = 0 -> restante 1
cedula 1 -> quantidade = 1 -> imprime "1 cedula(s) de 1" -> restante = 0

Saída:
1 cedula(s) de 5
1 cedula(s) de 1

---------------------------------------------------

Teste de Mesa 2:
Entrada:
valor = 47

Passo a passo:
cedula 20 -> quantidade = 2 -> imprime "2 cedula(s) de 20" -> restante = 7
cedula 10 -> quantidade = 0 -> restante = 7
cedula 5 -> quantidade = 1 -> restante = 2
cedula 2 -> quantidade = 1 -> restante = 0
cedula 1 -> quantidade = 0 -> encerra

Saída:
2 cedula(s) de 20
1 cedula(s) de 5
1 cedula(s) de 2

---------------------------------------------------

Teste de Mesa 3:
Entrada:
valor = 3

Passo a passo:
cedula 20 e 10 -> quantidades 0
cedula 5 -> quantidade 0
cedula 2 -> quantidade 1 -> restante = 1
cedula 1 -> quantidade 1 -> restante = 0

Saída:
1 cedula(s) de 2
1 cedula(s) de 1
*/
