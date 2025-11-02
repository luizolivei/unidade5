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
// Teste de mesa 1: primeiro termo 3/2=1.5
// Teste de mesa 2: dois termos 3/2 + 5/6 ≈ 2.3333
// Teste de mesa 3: tres termos 3/2 + 5/6 + 7/12 ≈ 2.9167
