import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("idade do primeiro homem: ");
        int homem1 = scanner.nextInt();

        System.out.print("idade do segundo homem: ");
        int homem2 = scanner.nextInt();

        System.out.print("idade da primeira mulher: ");
        int mulher1 = scanner.nextInt();

        System.out.print("idade da segunda mulher: ");
        int mulher2 = scanner.nextInt();

        int homemMaisVelho = 0;
        int homemMaisNovo = 0;
        if (homem1 < homem2) {
            homemMaisVelho = homem2;
            homemMaisNovo = homem1;
        } else {
            homemMaisVelho = homem1;
            homemMaisNovo = homem2;
        }

        int mulherMaisVelha = 0;
        int mulherMaisNova = 0;
        if (mulher1 < mulher2) {
            mulherMaisVelha = mulher2;
            mulherMaisNova = mulher1;
        } else {
            mulherMaisVelha = mulher1;
            mulherMaisNova = mulher2;
        }

        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma: " + soma + " Produto: " + produto);
    }
}

/*
Teste de Mesa 1:
Entrada:
homem1 = 40
homem2 = 30
mulher1 = 25
mulher2 = 35

Passo a passo:
Homens:
homem1 < homem2 → 40 < 30 → false
homemMaisVelho = 40, homemMaisNovo = 30

Mulheres:
mulher1 < mulher2 → 25 < 35 → true
mulherMaisVelha = 35, mulherMaisNova = 25

Cálculos:
soma = homemMaisVelho + mulherMaisNova = 40 + 25 = 65
produto = homemMaisNovo * mulherMaisVelha = 30 * 35 = 1050

Saída esperada:
Soma: 65 Produto: 1050

---------------------------------------------------

Teste de Mesa 2:
Entrada:
homem1 = 50
homem2 = 60
mulher1 = 40
mulher2 = 35

Passo a passo:
Homens:
50 < 60 → true
homemMaisVelho = 60, homemMaisNovo = 50

Mulheres:
40 < 35 → false
mulherMaisVelha = 40, mulherMaisNova = 35

Cálculos:
soma = 60 + 35 = 95
produto = 50 * 40 = 2000

Saída esperada:
Soma: 95 Produto: 2000

---------------------------------------------------

Teste de Mesa 3:
Entrada:
homem1 = 25
homem2 = 25
mulher1 = 30
mulher2 = 30

Passo a passo:
Homens:
25 < 25 → false
homemMaisVelho = 25, homemMaisNovo = 25

Mulheres:
30 < 30 → false
mulherMaisVelha = 30, mulherMaisNova = 30

Cálculos:
soma = 25 + 30 = 55
produto = 25 * 30 = 750

Saída esperada:
Soma: 55 Produto: 750
*/
