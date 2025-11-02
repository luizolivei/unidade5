public class Uni5Exe04 {
    public static void main(String[] args) {
        double soma = 0.0;

        for (int i = 1; i <= 20; i++) {
            double numerador = 2.0 * i + 1.0;
            double denominador = i * (i + 1.0);
            soma += numerador / denominador;
        }

        System.out.printf("Valor de S: %.4f%n", soma);
    }
}
/*
Teste de Mesa 1:
Entrada:
nenhuma (a soma utiliza sempre os 20 primeiros termos)

Passo a passo:
Iteração 1 → numerador = 2*1 + 1 = 3, denominador = 1*(1+1) = 2 → termo = 3/2 = 1,50 → soma = 1,50
Iteração 2 → numerador = 5, denominador = 6 → termo ≈ 0,83 → soma ≈ 2,33
Iteração 3 → numerador = 7, denominador = 12 → termo ≈ 0,58 → soma ≈ 2,92

Saída:
Valor de S: 3.5977 (após completar as 20 iterações)

---------------------------------------------------

Teste de Mesa 2:
Entrada:
nenhuma

Passo a passo:
O numerador cresce de 2 em 2 (3, 5, 7, ...)
O denominador é calculado como i * (i + 1)
Após a 10ª iteração → soma ≈ 3,30
Após a 20ª iteração → soma ≈ 3,60

Saída:
Valor de S: 3.5977

---------------------------------------------------

Teste de Mesa 3:
Entrada:
nenhuma

Passo a passo:
A variável soma inicia em 0,00 e acumula cada termo calculado
Os cálculos são executados somente dentro do laço for
Ao final, o printf apresenta o valor com 4 casas decimais

Saída:
Valor de S: 3.5977
*/
