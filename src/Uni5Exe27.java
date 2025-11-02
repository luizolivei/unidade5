import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int diaMaiorProducao = 0;
        int maiorProducao = -1;
        int totalManha = 0;
        int totalTarde = 0;
        boolean continuar = true;

        while (continuar) {
            int dia;
            while (true) {
                dia = scanner.nextInt();
                if (dia >= 1 && dia <= 30) {
                    break;
                }
                System.out.println("Dia invalido");
            }

            int producaoManha = scanner.nextInt();
            int producaoTarde = scanner.nextInt();
            int producaoTotal = producaoManha + producaoTarde;
            double valorRecebido;

            if (dia <= 15) {
                if (producaoTotal > 100 && producaoManha >= 30 && producaoTarde >= 30) {
                    valorRecebido = producaoTotal * 0.8;
                } else {
                    valorRecebido = producaoTotal * 0.5;
                }
            } else {
                valorRecebido = producaoManha * 0.4 + producaoTarde * 0.3;
            }

            System.out.printf("R$ %.2f%n", valorRecebido);

            if (producaoTotal > maiorProducao) {
                maiorProducao = producaoTotal;
                diaMaiorProducao = dia;
            }

            totalManha += producaoManha;
            totalTarde += producaoTarde;

            System.out.println("Novo funcionario (1.sim 2.nao)?");
            int resposta = scanner.nextInt();
            continuar = resposta == 1;
        }

        System.out.println("Dia de maior producao: " + diaMaiorProducao);
        if (totalManha > totalTarde) {
            System.out.println("Periodo com maior producao: manha " + totalManha);
        } else if (totalTarde > totalManha) {
            System.out.println("Periodo com maior producao: tarde " + totalTarde);
        } else {
            System.out.println("Periodo com maior producao: empate " + totalManha);
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
Funcionario 1 → dia = 10, producaoManha = 60, producaoTarde = 50 → resposta = 1
Funcionario 2 → dia = 20, producaoManha = 40, producaoTarde = 30 → resposta = 2

Passo a passo:
Funcionario 1: dia válido (≤ 15), producaoTotal = 110 (> 100) e ambos os turnos ≥ 30 → valorRecebido = 110 * 0.8 = 88.00
Maior produção passa a 110 no dia 10 → totalManha = 60, totalTarde = 50
Pergunta final recebe resposta 1 → outro funcionário é lido
Funcionario 2: dia = 20 (> 15) → valorRecebido = 40 * 0.4 + 30 * 0.3 = 25.00
Maior produção continua sendo 110 (dia 10) → totalManha = 100, totalTarde = 80
Resposta 2 encerra o laço
Comparação final → totalManha (100) maior que totalTarde (80)

Saída:
R$ 88.00
Novo funcionario (1.sim 2.nao)?
R$ 25.00
Novo funcionario (1.sim 2.nao)?
Dia de maior producao: 10
Periodo com maior producao: manha 100

---------------------------------------------------

Teste de Mesa 2:
Entrada:
Funcionario 1 → dia = 32 (inválido), dia = 5 (válido), producaoManha = 20, producaoTarde = 25 → resposta = 2

Passo a passo:
Primeira leitura do dia (32) imprime "Dia invalido" e repete a leitura até receber 5
Como producaoTotal = 45 ≤ 100 → valorRecebido = 45 * 0.5 = 22.50
totalManha = 20, totalTarde = 25 → período com maior produção = tarde 25

Saída:
Dia invalido
R$ 22.50
Novo funcionario (1.sim 2.nao)?
Dia de maior producao: 5
Periodo com maior producao: tarde 25

---------------------------------------------------

Teste de Mesa 3:
Entrada:
Funcionario 1 → dia = 18, producaoManha = 25, producaoTarde = 35 → resposta = 2

Passo a passo:
Dia > 15 → valorRecebido = 25 * 0.4 + 35 * 0.3 = 10.0 + 10.5 = 20.50
Maior produção = 60 no dia 18 → totalManha = 25, totalTarde = 35 → período com maior produção = tarde 35
Resposta 2 encerra imediatamente

Saída:
R$ 20.50
Novo funcionario (1.sim 2.nao)?
Dia de maior producao: 18
Periodo com maior producao: tarde 35
*/
