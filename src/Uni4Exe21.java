import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Altura ");
        double altura = scanner.nextDouble();

        System.out.print("Massa ");
        double massa = scanner.nextDouble();

        double imc = massa / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.println("Magreza");
        }
        else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Saudável");
        }
        else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        }
        else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I");
        }
        else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (severa)");
        }
        else {
            System.out.println("Obesidade Grau III (mórbida)");
        }

    }
}

/*
Teste de Mesa 1:
Entrada:
altura = 1.70
massa = 50

Passo a passo:
imc = 50 / (1.70^2) = 50 / 2.89 ≈ 17.30
imc < 18.5 → true
Imprime: "Magreza"

Saída esperada:
Magreza

---------------------------------------------------

Teste de Mesa 2:
Entrada:
altura = 1.75
massa = 70

Passo a passo:
imc = 70 / (1.75^2) = 70 / 3.0625 ≈ 22.86
18.5 <= imc <= 24.9 → true
Imprime: "Saudável"

Saída esperada:
Saudável

---------------------------------------------------

Teste de Mesa 3:
Entrada:
altura = 1.60
massa = 90

Passo a passo:
imc = 90 / (1.60^2) = 90 / 2.56 ≈ 35.16
35 <= imc <= 39.9 → true
Imprime: "Obesidade Grau II (severa)"

Saída esperada:
Obesidade Grau II (severa)
*/
