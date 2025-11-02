import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaAlturas = 0.0;
        int quantidadePessoas = 0;
        double somaAlturasMulheres = 0.0;
        int quantidadeMulheres = 0;

        while (true) {
            String generoTexto = scanner.next();
            char genero = generoTexto.charAt(0);

            double altura = scanner.nextDouble();

            if (altura == 0) {
                break;
            }

            somaAlturas += altura;
            quantidadePessoas++;

            if (genero == 'F' || genero == 'f') {
                somaAlturasMulheres += altura;
                quantidadeMulheres++;
            }
        }

        if (quantidadeMulheres > 0) {
            double mediaMulheres = somaAlturasMulheres / quantidadeMulheres;
            System.out.printf("A media da altura das mulheres e: %.2f%n", mediaMulheres);
        } else {
            System.out.println("A media da altura das mulheres e: 0.00");
        }

        if (quantidadePessoas > 0) {
            double mediaGrupo = somaAlturas / quantidadePessoas;
            System.out.printf("A media de altura do grupo e: %.2f%n", mediaGrupo);
        } else {
            System.out.println("A media de altura do grupo e: 0.00");
        }

        scanner.close();
    }
}

/*
---------------------------------------------------
Teste de Mesa 1:
Entrada:
M 1.85
F 1.58
f 1.67
O 1.90
M 0

Passo a passo:
Leitura 1 -> genero = 'M', altura = 1.85 -> somaAlturas = 1.85 -> qtdPessoas = 1 -> nenhuma mulher
Leitura 2 -> genero = 'F', altura = 1.58 -> somaAlturas = 3.43 -> qtdPessoas = 2 -> somaAlturasMulheres = 1.58 -> qtdMulheres = 1
Leitura 3 -> genero = 'f', altura = 1.67 -> somaAlturas = 5.10 -> qtdPessoas = 3 -> somaAlturasMulheres = 3.25 -> qtdMulheres = 2
Leitura 4 -> genero = 'O', altura = 1.90 -> somaAlturas = 7.00 -> qtdPessoas = 4 -> nenhuma mulher
Leitura 5 -> genero = 'M', altura = 0 -> encerra o laço

Cálculos finais:
mediaMulheres = 3.25 / 2 = 1.62
mediaGrupo = 7.00 / 4 = 1.75

Saída:
A media da altura das mulheres e: 1.62
A media de altura do grupo e: 1.75

---------------------------------------------------

Teste de Mesa 2:
Entrada:
M 1.80
M 1.70
m 1.75
F 0

Passo a passo:
Leitura 1 -> genero = 'M', altura = 1.80 -> somaAlturas = 1.80 -> qtdPessoas = 1
Leitura 2 -> genero = 'M', altura = 1.70 -> somaAlturas = 3.50 -> qtdPessoas = 2
Leitura 3 -> genero = 'm', altura = 1.75 -> somaAlturas = 5.25 -> qtdPessoas = 3
Leitura 4 -> genero = 'F', altura = 0 -> encerra o laço

Cálculos finais:
Nenhuma mulher válida -> mediaMulheres = 0.00
mediaGrupo = 5.25 / 3 = 1.75

Saída:
A media da altura das mulheres e: 0.00
A media de altura do grupo e: 1.75

---------------------------------------------------

Teste de Mesa 3:
Entrada:
M 0

Passo a passo:
Leitura 1 -> genero = 'M', altura = 0 -> encerra o laço imediatamente -> nenhum dado processado

Cálculos finais:
Nenhuma mulher e nenhum grupo -> médias = 0.00

Saída:
A media da altura das mulheres e: 0.00
A media de altura do grupo e: 0.00
---------------------------------------------------
*/