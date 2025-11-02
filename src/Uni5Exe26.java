import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pedagioMaximo = scanner.nextDouble();
        int trechosInformados = 0;
        int trechosAcimaLimite = 0;
        int trechosAceitosAcima150 = 0;

        while (true) {
            double valorPedagio = scanner.nextDouble();
            if (valorPedagio < 0) {
                break;
            }
            double distancia = scanner.nextDouble();
            trechosInformados++;
            if (valorPedagio > pedagioMaximo) {
                trechosAcimaLimite++;
            }
            if (distancia > 150 && valorPedagio <= pedagioMaximo) {
                trechosAceitosAcima150++;
            }
        }

        System.out.println(trechosAcimaLimite);
        System.out.println(trechosInformados);
        System.out.println(trechosAceitosAcima150);

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
pedagioMaximo = 8.0
Trechos: (7.5, 120), (9.0, 100), (6.0, 160), (10.0, 200), (8.0, 180), (9.5, 140), (-1)

Passo a passo:
Trecho 1 -> valor 7.5 ≤ 8.0 -> trechosInformados = 1
Trecho 2 -> valor 9.0 > 8.0 -> trechosAcimaLimite = 1 -> trechosInformados = 2
Trecho 3 -> valor 6.0 ≤ 8.0 e distância 160 > 150 -> trechosAceitosAcima150 = 1 -> trechosInformados = 3
Trecho 4 -> valor 10.0 > 8.0 -> trechosAcimaLimite = 2 -> trechosInformados = 4
Trecho 5 -> valor 8.0 ≤ 8.0 e distância 180 > 150 -> trechosAceitosAcima150 = 2 -> trechosInformados = 5
Trecho 6 -> valor 9.5 > 8.0 -> trechosAcimaLimite = 3 -> trechosInformados = 6
Valor negativo encerra a leitura

Saída:
3
6
2

---------------------------------------------------

Teste de Mesa 2:
Entrada:
pedagioMaximo = 7.0
Trechos: (5.0, 160), (6.5, 170), (7.0, 200), (4.0, 140), (-1)

Passo a passo:
Trechos 1, 2 e 3 têm distância > 150 e valor ≤ limite -> trechosAceitosAcima150 = 3
Trecho 4 tem distância ≤ 150 -> não incrementa o terceiro contador
Nenhum valor excede o limite -> trechosAcimaLimite = 0
Total de trechos informados = 4

Saída:
0
4
3

---------------------------------------------------

Teste de Mesa 3:
Entrada:
pedagioMaximo = 5.0
Trechos: (-1)

Passo a passo:
Primeiro valor já é negativo -> laço encerra sem registrar trechos

Saída:
0
0
0
*/
