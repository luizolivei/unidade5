import java.util.Scanner;

public class Uni4Exe07 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com peso da carta: ");
        float peso = scanner.nextFloat();
        float valorPagar = 0;
        float pesoExcedido = 0;

        if (peso <= 50) {
            valorPagar = 0.45f;
        } else {
            pesoExcedido = peso - 50;
            float qtAdicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45f + 0.45f * qtAdicional;
        }

        System.out.println("Custo do selo: " + valorPagar); 
        scanner.close();
    }
}

/*
Teste de Mesa 1:
Entrada:
peso = 45

Passo a passo:
peso <= 50 → true
valorPagar = 0.45
Não entra no else
Saída:
Custo do selo: 0.45

---------------------------------------------------

Teste de Mesa 2:
Entrada:
peso = 70

Passo a passo:
peso <= 50 → false
pesoExcedido = 70 - 50 = 20
qtAdicional = (20 / 20) + 1 = 1 + 1 = 2
valorPagar = 0.45 + 0.45 * 2 = 0.45 + 0.9 = 1.35
Saída:
Custo do selo: 1.35

---------------------------------------------------

Teste de Mesa 3:
Entrada:
peso = 95

Passo a passo:
peso <= 50 → false
pesoExcedido = 95 - 50 = 45
qtAdicional = (45 / 20) + 1 = 2.25 + 1 = 3.25
valorPagar = 0.45 + 0.45 * 3.25 = 0.45 + 1.4625 = 1.9125
Saída:
Custo do selo: 1.9125
*/
