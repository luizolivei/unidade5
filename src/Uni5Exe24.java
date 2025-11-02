import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double totalPescado = 0.0;
        boolean continuar = true;

        while (continuar) {
            double pesoGramas = scanner.nextDouble();
            totalPescado += pesoGramas / 1000.0;
            System.out.printf("Peso total acumulado: %.2f kg%n", totalPescado);
            if (totalPescado > limiteDiario) {
                System.out.println("Limite excedido");
                break;
            }
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        scanner.close();
    }
}
/*
Teste de Mesa 1:
Entrada:
limiteDiario = 5.0
pesagens = [1000, 2000, 2000] -> respostas = ["s", "n"]

Passo a passo:
Leitura 1 -> pesoGramas = 1000 -> totalPescado = 1.00 kg -> abaixo do limite -> resposta "s"
Leitura 2 -> pesoGramas = 2000 -> totalPescado = 3.00 kg -> ainda abaixo -> resposta "n" -> encerra

Saída:
Peso total acumulado: 1.00 kg
Peso total acumulado: 3.00 kg

---------------------------------------------------

Teste de Mesa 2:
Entrada:
limiteDiario = 3.0
pesagens = [2000, 1500]

Passo a passo:
Primeiro peixe -> total = 2.00 kg -> continua
Segundo peixe -> total = 3.50 kg -> maior que limite -> imprime "Limite excedido" e encerra sem pedir resposta

Saída:
Peso total acumulado: 2.00 kg
Peso total acumulado: 3.50 kg
Limite excedido

---------------------------------------------------

Teste de Mesa 3:
Entrada:
limiteDiario = 2.0
pesagens = [500] -> resposta = "n"

Passo a passo:
Primeiro peixe -> total = 0.50 kg -> como não excede e resposta é "n" -> encerra

Saída:
Peso total acumulado: 0.50 kg
*/
