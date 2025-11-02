public class Uni5Exe03 {
    public static void main(String[] args) {
        double soma = 0.0;

        for (int i = 1; i <= 100; i++) {
            soma += 1.0 / i;
        }

        System.out.printf("Soma da serie: %.4f%n", soma);
    }
}
/*
Teste de Mesa 1:
Entrada:
nenhuma (a série de 100 termos é fixa)

Passo a passo:
Termo 1 → 1/1 = 1,00 → soma = 1,00
Termo 2 → 1/2 = 0,50 → soma = 1,00 + 0,50 = 1,50
Termo 3 → 1/3 ≈ 0,33 → soma ≈ 1,50 + 0,33 = 1,83
...
Termo 100 → 1/100 = 0,01 → soma final ≈ 5,1874

Saída:
Soma da serie: 5.1874

---------------------------------------------------

Teste de Mesa 2:
Entrada:
nenhuma

Passo a passo:
Os termos formam a série harmônica → cada denominador aumenta em 1
Após 10 termos → soma ≈ 2,9289
Após 50 termos → soma ≈ 4,4992
O laço segue acumulando até o 100º termo

Saída:
Soma da serie: 5.1874

---------------------------------------------------

Teste de Mesa 3:
Entrada:
nenhuma

Passo a passo:
A variável soma inicia em 0,00
Para cada i de 1 a 100 → soma recebe soma + 1.0 / i
Não há desvios condicionais, apenas o laço acumulando
O printf exibe o valor com 4 casas decimais

Saída:
Soma da serie: 5.1874
*/
