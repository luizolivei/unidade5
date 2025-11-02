import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String nome = scanner.next();
            if (nome.equalsIgnoreCase("fim")) {
                break;
            }
            double nota1 = scanner.nextDouble();
            double nota2 = scanner.nextDouble();
            double media = (nota1 + nota2) / 2.0;
            System.out.printf("A media do(a) %s e %.2f%n", nome, media);
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
"Maria" 6 10 "Joao" 4 8 "fim"

Passo a passo:
Leitura 1 → nome = "Maria" → notas 6 e 10 → media = (6 + 10) / 2 = 8.00 → imprime "A media do(a) Maria e 8.00"
Leitura 2 → nome = "Joao" → notas 4 e 8 → media = 6.00 → imprime "A media do(a) Joao e 6.00"
Leitura 3 → nome = "fim" → encerra o laço

Saída:
A media do(a) Maria e 8.00
A media do(a) Joao e 6.00

---------------------------------------------------

Teste de Mesa 2:
Entrada:
"Ana" 7 7 "fim"

Passo a passo:
Primeira leitura → nome = "Ana" → media = (7 + 7) / 2 = 7.00
Próxima leitura → nome = "fim" → termina o processamento

Saída:
A media do(a) Ana e 7.00

---------------------------------------------------

Teste de Mesa 3:
Entrada:
"fim"

Passo a passo:
Primeira leitura já é "fim" → laço while é encerrado imediatamente

Saída:
(nenhuma linha é impressa)
*/
