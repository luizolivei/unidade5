public class Uni5Exe02 {
    public static void main(String[] args) {
        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                somaPares += i;
            } else {
                somaImpares += i;
            }
        }

        System.out.println("Soma dos numeros pares: " + somaPares);
        System.out.println("Soma dos numeros impares: " + somaImpares);
    }
}
// Teste de mesa 1: intervalo 1 a 10 gera pares 2+4+6+8+10=30 e impares 1+3+5+7+9=25
// Teste de mesa 2: intervalo 1 a 4 gera pares 2+4=6 e impares 1+3=4
// Teste de mesa 3: intervalo 1 a 1 gera pares 0 e impares 1
