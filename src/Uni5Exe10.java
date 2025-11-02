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
// Teste de mesa 1: primeiros resultados incluem 81 e 2025
// Teste de mesa 2: verificando soma 98+01 gera 99^2=9801
// Teste de mesa 3: conferindo 494209 com partes 494 e 209 soma 703 quadrado 494209
