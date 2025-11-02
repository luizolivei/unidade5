public class Uni5Exe03 {
    public static void main(String[] args) {
        double soma = 0.0;

        for (int i = 1; i <= 100; i++) {
            soma += 1.0 / i;
        }

        System.out.printf("Soma da serie: %.4f%n", soma);
    }
}
// Teste de mesa 1: ate 1 termo soma=1.0
// Teste de mesa 2: ate 2 termos soma=1.0+0.5=1.5
// Teste de mesa 3: ate 3 termos soma=1.0+0.5+0.3333=1.8333
