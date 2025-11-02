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
// Teste de mesa 1: sequencia exemplo gera pagamentos 88 65 55 43 21 41 e totais finais
// Teste de mesa 2: dia invalido repetido ate leitura correta
// Teste de mesa 3: dois funcionarios com respostas 1 e 2 encerra e mostra totais
