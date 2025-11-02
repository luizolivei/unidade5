import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hora de chegada (0-23): ");
        int horaChegada = scanner.nextInt();
        System.out.print("Minuto de chegada (0-59): ");
        int minChegada = scanner.nextInt();

        System.out.print("Hora de saída (0-23): ");
        int horaSaida = scanner.nextInt();
        System.out.print("Minuto de saída (0-59): ");
        int minSaida = scanner.nextInt();

        if (horaChegada < 0 || horaChegada > 23 || horaSaida < 0 || horaSaida > 23 ||
                minChegada < 0 || minChegada > 59 || minSaida < 0 || minSaida > 59) {
            System.out.println("Erro: hora ou minuto inválido.");
            scanner.close();
            return;
        }

        int totalMinutosChegada = horaChegada * 60 + minChegada;
        int totalMinutosSaida = horaSaida * 60 + minSaida;

        if (totalMinutosSaida < totalMinutosChegada) {
            System.out.println("Erro: saída não pode ser antes da chegada.");
            scanner.close();
            return;
        }

        int duracaoMinutos = totalMinutosSaida - totalMinutosChegada;

        int horas = duracaoMinutos / 60;
        int minutosRestantes = duracaoMinutos % 60;

        if (horas == 0 && minutosRestantes > 0 && minutosRestantes < 30) {
            horas = 1;
        } else if (minutosRestantes >= 30) {
            horas += 1;
        }

        double preco = 0;
        if (horas >= 1) {
            if (horas >= 1) preco += Math.min(horas, 2) * 5;
            if (horas > 2) {
                preco += Math.min(horas - 2, 2) * 7.5;
            }
            if (horas > 4) {
                preco += (horas - 4) * 10;
            }
        }

        System.out.println("Tempo estacionado: " + horas + " hora(s)");
        System.out.printf("Preço cobrado = R$%.2f\n", preco);

        scanner.close();
    }
}

/*
Teste de Mesa 1:
Entrada:
horaChegada = 13
minChegada = 10
horaSaida = 13
minSaida = 22

Passo a passo:
totalMinutosChegada = 13*60 + 10 = 790
totalMinutosSaida = 13*60 + 22 = 802
duracaoMinutos = 802 - 790 = 12
horas = 12 / 60 = 0
minutosRestantes = 12
0 < minutosRestantes < 30 → horas = 1
Preço:
horas >=1 → min(1,2)*5 = 5
Imprime:
Tempo estacionado: 1 hora(s)
Preço cobrado = R$5.00

---------------------------------------------------

Teste de Mesa 2:
Entrada:
horaChegada = 3
minChegada = 40
horaSaida = 5
minSaida = 15

Passo a passo:
totalMinutosChegada = 220
totalMinutosSaida = 315
duracaoMinutos = 95
horas = 95 / 60 = 1
minutosRestantes = 35 → >= 30 → horas +=1 → horas = 2
Preço:
min(2,2)*5 = 10
Imprime:
Tempo estacionado: 2 hora(s)
Preço cobrado = R$10.00

---------------------------------------------------

Teste de Mesa 3:
Entrada:
horaChegada = 8
minChegada = 5
horaSaida = 12
minSaida = 46

Passo a passo:
totalMinutosChegada = 485
totalMinutosSaida = 766
duracaoMinutos = 281
horas = 281/60 = 4
minutosRestantes = 41 → >= 30 → horas +=1 → horas = 5
Preço:
primeiras 2h: 2*5 = 10
próximas 2h: 2*7.5 = 15
hora adicional: 5-4=1 → 1*10 = 10
preco = 10 + 15 + 10 = 35
Imprime:
Tempo estacionado: 5 hora(s)
Preço cobrado = R$35.00
*/

