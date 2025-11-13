import java.util.Scanner;

public class Uni6Exe10 {

    private int[] vetor = new int[50];
    private int tamanho = 0;
    private Scanner teclado = new Scanner(System.in);

    private Uni6Exe10() {
        int opcao;

        do {
            System.out.println(" ________     MENU     ________");
            System.out.println(" 1 – Incluir valor;");
            System.out.println(" 2 – Pesquisar valor;");
            System.out.println(" 3 – Alterar valor;");
            System.out.println(" 4 – Excluir valor;");
            System.out.println(" 5 – Mostrar valores;");
            System.out.println(" 6 – Ordenar valores;");
            System.out.println(" 7 – Inverter valores;");
            System.out.println(" 8 – Sair do sistema;");
            System.out.print(" Opção: ");

            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    incluirValor();
                    break;
                case 2:
                    pesquisarValor();
                    break;
                case 3:
                    alterarValor();
                    break;
                case 4:
                    excluirValor();
                    break;
                case 5:
                    mostrarValores();
                    break;
                case 6:
                    ordenarValores();
                    break;
                case 7:
                    inverterValores();
                    break;
                case 8:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 8);
    }

    private void incluirValor() {
        if (tamanho == 50) {
            System.out.println("Vetor cheio. Não foi possível incluir.");
            return;
        }

        System.out.print("Digite o valor a incluir: ");
        int valor = teclado.nextInt();

        vetor[tamanho] = valor;
        tamanho++;

        System.out.println("Valor incluído com sucesso!");
    }

    private void pesquisarValor() {
        System.out.print("Valor a pesquisar: ");
        int valor = teclado.nextInt();

        boolean encontrou = false;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                encontrou = true;
                break;
            }
        }

        if (encontrou)
            System.out.println("Valor encontrado no vetor.");
        else
            System.out.println("Valor não encontrado.");
    }

    private void alterarValor() {
        System.out.print("Valor a alterar: ");
        int antigo = teclado.nextInt();

        boolean encontrou = false;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == antigo) {
                System.out.print("Novo valor: ");
                vetor[i] = teclado.nextInt();
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Número não encontrado.");
        } else {
            System.out.println("Valor alterado com sucesso.");
        }
    }

    private void excluirValor() {
        System.out.print("Valor a excluir: ");
        int valor = teclado.nextInt();

        int pos = -1;

        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == valor) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("Valor não encontrado.");
            return;
        }

        // Desloca todos os elementos para trás
        for (int i = pos; i < tamanho - 1; i++) {
            vetor[i] = vetor[i + 1];
        }

        tamanho--;
        System.out.println("Valor excluído com sucesso.");
    }

    private void mostrarValores() {
        if (tamanho == 0) {
            System.out.println("Vetor vazio.");
            return;
        }

        System.out.print("Valores: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    private void ordenarValores() {
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        System.out.println("Valores ordenados com sucesso!");
    }

    private void inverterValores() {
        for (int i = 0; i < tamanho / 2; i++) {
            int aux = vetor[i];
            vetor[i] = vetor[tamanho - 1 - i];
            vetor[tamanho - 1 - i] = aux;
        }
        System.out.println("Valores invertidos.");
    }

    public static void main(String[] args) {
        new Uni6Exe10();
    }
}
