import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero de ponto flutuante:\n");
        float numeroFlutuante = scanner.nextFloat();

        if (numeroFlutuante % 1 != 0) {
            System.out.print("Casas decimais foram digitadas");
        } else {
            System.out.print("Casas decimais não foram digitadas");
        }

        scanner.close();
    }
}

/*
Teste de Mesa 1:
Entrada:
numeroFlutuante = 10.5

Passo a passo:
10.5 % 1 = 0.5 ≠ 0
Então imprime: "Casas decimais foram digitadas"

Saída esperada:
Casas decimais foram digitadas

---------------------------------------------------

Teste de Mesa 2:
Entrada:
numeroFlutuante = 7.0

Passo a passo:
7.0 % 1 = 0
Então imprime: "Casas decimais não foram digitadas"

Saída esperada:
Casas decimais não foram digitadas

---------------------------------------------------

Teste de Mesa 3:
Entrada:
numeroFlutuante = 3.1415

Passo a passo:
3.1415 % 1 = 0.1415 ≠ 0
Então imprime: "Casas decimais foram digitadas"

Saída esperada:
Casas decimais foram digitadas
*/
