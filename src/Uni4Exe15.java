import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantos meses o funcionario foi admitido: ");
        int qtdMeses = scanner.nextInt();

      if (qtdMeses <= 12) {
          System.out.print("O funcionário irá receber 5% de reajuste");
          return;
      }

        if (qtdMeses <= 48) {
            System.out.print("O funcionário irá receber 7% de reajuste");
            return;
        }

        System.out.print("Reajuste não informado");
        return;
    }
}

/*
Teste de Mesa 1:
Entrada:
qtdMeses = 8

Passo a passo:
qtdMeses <= 12 → 8 <= 12 → true
Imprime: "O funcionário irá receber 5% de reajuste"

Saída esperada:
O funcionário irá receber 5% de reajuste

---------------------------------------------------

Teste de Mesa 2:
Entrada:
qtdMeses = 36

Passo a passo:
qtdMeses <= 12 → 36 <= 12 → false
qtdMeses <= 48 → 36 <= 48 → true
Imprime: "O funcionário irá receber 7% de reajuste"

Saída esperada:
O funcionário irá receber 7% de reajuste

---------------------------------------------------

Teste de Mesa 3:
Entrada:
qtdMeses = 60

Passo a passo:
qtdMeses <= 12 → 60 <= 12 → false
qtdMeses <= 48 → 60 <= 48 → false
Imprime: "Reajuste não informado"

Saída esperada:
Reajuste não informado
*/
