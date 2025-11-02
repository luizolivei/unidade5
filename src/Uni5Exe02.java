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

/*
Teste de Mesa 1:
Entrada:
nenhuma (o intervalo 1 a 100 é fixo)

Passo a passo:
i = 1 -> 1 é ímpar -> somaImpares passa de 0 para 1
i = 2 -> 2 é par -> somaPares passa de 0 para 2
i = 3 -> 3 é ímpar -> somaImpares passa de 1 para 4
...
i = 100 -> 100 é par -> somaPares passa de 2450 para 2550 (valor final após todas as iterações)

Saída:
Soma dos numeros pares: 2550
Soma dos numeros impares: 2500

---------------------------------------------------

Teste de Mesa 2:
Entrada:
nenhuma

Passo a passo:
Observando somente os números pares: sequência 2, 4, 6, ..., 100
Quantidade de termos pares = 50
SomaPares = (2 + 100) * 50 / 2 = 102 * 25 = 2550
Como nenhum ímpar é somado nessa conta, somaImpares permanece sendo tratada no else

Saída:
Soma dos numeros pares: 2550
Soma dos numeros impares: 2500

---------------------------------------------------

Teste de Mesa 3:
Entrada:
nenhuma

Passo a passo:
Observando somente os números ímpares: sequência 1, 3, 5, ..., 99
Quantidade de termos ímpares = 50
SomaImpares = (1 + 99) * 50 / 2 = 100 * 25 = 2500
Como os pares são tratados no if, somaPares acumula 2550

Saída:
Soma dos numeros pares: 2550
Soma dos numeros impares: 2500
*/
