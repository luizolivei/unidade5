import java.util.Scanner;

public class Uni4Exe23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o mes do ano:");

        int mes = scanner.nextInt();

        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Março");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Valor invalido");
        }

        scanner.close();
    }
}

/*
Teste de Mesa 1:
Entrada:
mes = 1

Passo a passo:
switch(mes):
case 1 → true
Imprime: "Janeiro"

Saída esperada:
Janeiro

---------------------------------------------------

Teste de Mesa 2:
Entrada:
mes = 7

Passo a passo:
switch(mes):
case 7 → true
Imprime: "Julho"

Saída esperada:
Julho

---------------------------------------------------

Teste de Mesa 3:
Entrada:
mes = 13

Passo a passo:
switch(mes):
case 1..12 → todas false
default → true
Imprime: "Valor invalido"

Saída esperada:
Valor invalido
*/
