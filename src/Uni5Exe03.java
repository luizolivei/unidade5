public class Uni5Exe03 {
    public static void main(String[] args) {
        double soma = 0.0;

        for (int i = 1; i <= 100; i++) {
            soma += 1.0 / i;
        }

        System.out.printf("A soma da série é: %.6f%n", soma);
    }
}

/*
Teste de Mesa:
Entrada:
Não tem

Passo a passo:
Termo 1 -> 1/1 = 1,00 -> soma = 1,00
Termo 2 -> 1/2 = 0,50 -> soma = 1,00 + 0,50 = 1,50
Termo 3 -> 1/3 ≈ 0,33 -> soma ≈ 1,50 + 0,33 = 1,83
...
Termo 100 -> 1/100 = 0,01 -> soma final ≈ 5,187378

Saída:
Soma da serie: 5.187378
*/
