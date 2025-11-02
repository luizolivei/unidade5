import java.util.Scanner;

public class Uni4Exe06 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra (M/F/I): ");
        String entrada = scanner.nextLine().trim().toUpperCase();

        char letra = entrada.charAt(0);

        switch (letra) {
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            case 'I':
                System.out.println("Não Informado");
                break;
            default:
                System.out.println("Entrada Incorreta");
                break;
        }

        scanner.close();
    }
}

/*
Teste de Mesa 1:
Entrada:
entrada = "M"

Passo a passo:
entrada.trim().toUpperCase() → "M"
letra = 'M'
switch(letra):
  case 'M' → true → imprime: "Masculino"

Saída esperada:
Masculino

---------------------------------------------------

Teste de Mesa 2:
Entrada:
entrada = "f"

Passo a passo:
entrada.trim().toUpperCase() → "F"
letra = 'F'
switch(letra):
  case 'F' → true → imprime: "Feminino"

Saída esperada:
Feminino

---------------------------------------------------

Teste de Mesa 3:
Entrada:
entrada = "x"

Passo a passo:
entrada.trim().toUpperCase() → "X"
letra = 'X'
switch(letra):
  nenhum case corresponde → default → imprime: "Entrada Incorreta"

Saída esperada:
Entrada Incorreta
*/
