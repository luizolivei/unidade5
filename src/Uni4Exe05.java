import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("A cor é azul? (true ou false): ");
        boolean resposta = scanner.nextBoolean();

        if (resposta) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        scanner.close();
    }
}

/*
Teste de Mesa 1:
Entrada:
resposta = true

Passo a passo:
if (resposta) → true
Então imprime: "Sim"

Saída esperada:
Sim

---------------------------------------------------

Teste de Mesa 2:
Entrada:
resposta = false

Passo a passo:
if (resposta) → false
Vai para o else
Então imprime: "Não"

Saída esperada:
Não

---------------------------------------------------

Teste de Mesa 3:
Entrada:
resposta = true

Passo a passo:
if (resposta) → true
Então imprime: "Sim"

Saída esperada:
Sim
*/
