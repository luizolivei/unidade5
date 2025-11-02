public class Uni5Exe10 {
    public static void main(String[] args) {
        long[] numeros = new long[10];
        int encontrados = 0;
        int metadeDigitos = 1;

        while (encontrados < 10) {
            long base = 1;
            for (int i = 0; i < metadeDigitos; i++) {
                base *= 10;
            }
            long limiteSoma = 2 * base;
            for (long soma = 0; soma < limiteSoma && encontrados < 10; soma++) {
                long numerador = soma * soma - soma;
                long divisor = base - 1;
                if (divisor == 0) {
                    continue;
                }
                if (numerador % divisor != 0) {
                    continue;
                }
                long parteA = numerador / divisor;
                long parteB = soma - parteA;
                if (parteA < 0 || parteA >= base) {
                    continue;
                }
                if (parteB < 0 || parteB >= base) {
                    continue;
                }
                long candidato = parteA * base + parteB;
                long menorComMesmaQuantidadeDigitos = base / 10;
                if (candidato < menorComMesmaQuantidadeDigitos) {
                    continue;
                }
                numeros[encontrados] = candidato;
                encontrados++;
            }
            metadeDigitos++;
        }

        for (long numero : numeros) {
            System.out.println(numero);
        }
    }
}
/*
Teste de Mesa 1:
Entrada:
nenhuma (os valores são calculados internamente)

Passo a passo:
metadeDigitos = 1 → base = 10
soma = 1 → numerador = 1 * 1 - 1 = 0 → divisor = 9 → parteA = 0, parteB = 1 → candidato = 1 → armazenado em numeros[0]
soma = 9 → numerador = 9 * 9 - 9 = 72 → divisor = 9 → parteA = 8, parteB = 1 → candidato = 81 → armazenado em numeros[1]
Como ainda faltam posições, metadeDigitos é incrementado para 2

Saída parcial:
1
81
...

---------------------------------------------------

Teste de Mesa 2:
Entrada:
nenhuma

Passo a passo:
metadeDigitos = 2 → base = 100
soma = 45 → numerador = 45 * 45 - 45 = 1980 → divisor = 99 → parteA = 20, parteB = 25 → candidato = 2025 → armazenado em numeros[2]
soma = 55 → numerador = 55 * 55 - 55 = 2970 → divisor = 99 → parteA = 30, parteB = 25 → candidato = 3025 → armazenado em numeros[3]
soma = 99 → numerador = 99 * 99 - 99 = 9702 → divisor = 99 → parteA = 98, parteB = 1 → candidato = 9801 → armazenado em numeros[4]

Saída parcial:
1
81
2025
3025
9801
...

---------------------------------------------------

Teste de Mesa 3:
Entrada:
nenhuma

Passo a passo:
O processo continua até preencher os 10 elementos do vetor numeros
Valores finais encontrados: [1, 81, 2025, 3025, 9801, 88209, 494209, 998001, 4941729, 7441984]
Cada valor impresso está separado por quebra de linha conforme o laço final

Saída:
1
81
2025
3025
9801
88209
494209
998001
4941729
7441984
*/
