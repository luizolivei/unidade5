import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o limite diario de pesca (em kg): ");
        double limiteDiario = scanner.nextDouble();

        double totalPescado = 0.0;
        boolean continuar = true;

        while (continuar) {
            System.out.print("Informe o peso do peixe (em gramas): ");
            double pesoGramas = scanner.nextDouble();

            totalPescado += pesoGramas / 1000.0; // converte para kg
            System.out.printf("Peso total acumulado: %.2f kg%n", totalPescado);

            if (totalPescado > limiteDiario) {
                System.out.println("⚠Limite diario de pesca excedido! Encerrando...");
                break;
            }

            System.out.print("Deseja informar o peso de mais um peixe? (s = SIM / n = NAO): ");
            String resposta = scanner.next();
            continuar = resposta.equalsIgnoreCase("s");
        }

        System.out.println("\nResumo final:");
        System.out.printf("Peso total pescado: %.2f kg%n", totalPescado);
        if (totalPescado > limiteDiario) {
            System.out.println("Situação: LIMITE EXCEDIDO");
        } else {
            System.out.println("Situação: Dentro do limite");
        }

        scanner.close();
    }
}

/*
---------------------------------------------------
TESTE DE MESA 1:
Entrada:
Informe o limite diario de pesca (em kg): 5
Informe o peso do peixe (em gramas): 1000
Deseja informar o peso de mais um peixe? (s = SIM / n = NAO): s
Informe o peso do peixe (em gramas): 2000
Deseja informar o peso de mais um peixe? (s = SIM / n = NAO): n

Passo a passo:
Leitura 1 -> peso = 1000g -> total = 1.00 kg -> ainda abaixo do limite (5 kg)
Leitura 2 -> peso = 2000g -> total = 3.00 kg -> ainda abaixo -> resposta 'n' encerra

Saída esperada:
Informe o limite diario de pesca (em kg): 5
Informe o peso do peixe (em gramas): 1000
Peso total acumulado: 1.00 kg
Deseja informar o peso de mais um peixe? (s = SIM / n = NAO): s
Informe o peso do peixe (em gramas): 2000
Peso total acumulado: 3.00 kg
Deseja informar o peso de mais um peixe? (s = SIM / n = NAO): n
Resumo final:
Peso total pescado: 3.00 kg
Situação: Dentro do limite

---------------------------------------------------
TESTE DE MESA 2:
Entrada:
Informe o limite diario de pesca (em kg): 3
Informe o peso do peixe (em gramas): 2000
Informe o peso do peixe (em gramas): 1500

Passo a passo:
1º peixe -> 2000g = 2.00 kg -> continua
2º peixe -> 1500g = 1.50 kg -> total = 3.50 kg -> excede limite -> encerra

Saída esperada:
Informe o limite diario de pesca (em kg): 3
Informe o peso do peixe (em gramas): 2000
Peso total acumulado: 2.00 kg
Informe o peso do peixe (em gramas): 1500
Peso total acumulado: 3.50 kg
 Limite diario de pesca excedido! Encerrando...
Resumo final:
Peso total pescado: 3.50 kg
Situação: LIMITE EXCEDIDO

---------------------------------------------------
TESTE DE MESA 3:
Entrada:
Informe o limite diario de pesca (em kg): 2
Informe o peso do peixe (em gramas): 500
Deseja informar o peso de mais um peixe? (s = SIM / n = NAO): n

Passo a passo:
1º peixe -> 500g = 0.50 kg -> total 0.50 kg -> ainda abaixo -> encerra por resposta 'n'

Saída esperada:
Informe o limite diario de pesca (em kg): 2
Informe o peso do peixe (em gramas): 500
Peso total acumulado: 0.50 kg
Deseja informar o peso de mais um peixe? (s = SIM / n = NAO): n
Resumo final:
Peso total pescado: 0.50 kg
Situação: Dentro do limite
---------------------------------------------------
*/
