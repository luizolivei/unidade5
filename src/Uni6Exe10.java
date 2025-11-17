import java.util.Scanner;

public class Uni6Exe10 {

    private Uni6Exe10() {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[50];
        int posFim = 0;
        int opcao;

        do {
            System.out.println(" _____ MENU _____ ");
            System.out.println("1 - Incluir valor");
            System.out.println("2 - Pesquisar valor");
            System.out.println("3 - Alterar valor");
            System.out.println("4 - Excluir valor");
            System.out.println("5 - Mostrar valores");
            System.out.println("6 - Ordenar valores");
            System.out.println("7 - Inverter valores");
            System.out.println("8 - Sair do sistema");
            System.out.print(" Opcao: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    posFim = incluir(vet, posFim, teclado);
                    break;
                case 2:
                    pesquisar(vet, posFim, teclado);
                    break;
                case 3:
                    alterar(vet, posFim, teclado);
                    break;
                case 4:
                    posFim = excluir(vet, posFim, teclado);
                    break;
                case 5:
                    mostrar(vet, posFim);
                    break;
                case 6:
                    ordenar(vet, posFim);
                    break;
                case 7:
                    inverter(vet, posFim);
                    break;
                case 8:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opcao invalida.");
            }
        } while (opcao != 8);
    }

    private int incluir(int vet[], int posFim, Scanner teclado) {
        if (posFim < vet.length) {
            System.out.print(" valor: ");
            vet[posFim] = teclado.nextInt();
            System.out.println("_ incluído em vet[" + posFim + "].");
            posFim++;
        } else {
            System.out.println("_ não incluído - vetor cheio ..");
        }
        return posFim;
    }

    private int pesquisar(int vet[], int posFim, Scanner teclado) {
        System.out.print(" valor pesquisa: ");
        int valor = teclado.nextInt();
        for (int i = 0; i < posFim; i++) {
            if (valor == vet[i]) {
                System.out.println("_ encontrado vet[" + i + "]");
                return i;
            }
        }
        System.out.println("_ Não encontrado.");
        return -1;
    }

    private void alterar(int vet[], int posFim, Scanner teclado) {
        int valorId = pesquisar(vet, posFim, teclado);
        if (valorId != -1) {
            System.out.print(" valor troca: ");
            vet[valorId] = teclado.nextInt();
            System.out.println("_ valor troca vet[" + valorId + "]: " + vet[valorId]);
        }
    }

    private int excluir(int vet[], int posFim, Scanner teclado) {
        int valorId = pesquisar(vet, posFim, teclado);
        if (valorId != -1) {
            for (int i = valorId; i < (posFim - 1); i++) {
                vet[i] = vet[i + 1];
            }
            posFim--;
            System.out.println("_ valor excluido.");
        }
        return posFim;
    }

    private void mostrar(int vet[], int posFim) {
        System.out.println("_ vetor valores __ ");
        for (int i = 0; i < posFim; i++) {
            System.out.println("vet[" + i + "] " + vet[i]);
        }
    }

    private void ordenar(int vet[], int posFim) {
        int bolha;
        for (int i = 0; i < posFim - 1; i++) {
            if (vet[i] > vet[i + 1]) {
                bolha = vet[i];
                vet[i] = vet[i + 1];
                vet[i + 1] = bolha;
                i = -1;
            }
        }
    }

    private void inverter(int vet[], int posFim) {
        int temp = 0;
        for (int i = 0; i < posFim; i++) {
            for (int j = 0; j < i; j++) {
                temp = vet[i];
                vet[i] = vet[j];
                vet[j] = temp;
            }
        }
    }

    public static void main(String args[]) {
        new Uni6Exe10();
    }
}

/*
Teste de Mesa 1:
Entrada:
Operações: incluir 3 valores (1,2,3), mostrar, sair

Passo a passo:
Menu 1 chamado três vezes -> vet = [1,2,3]
Opção 5 percorre e imprime os três valores
Opção 8 encerra

Saída:
Confirmações de inclusão, listagem com vet[0] 1, vet[1] 2, vet[2] 3 e mensagem "Encerrando..."

---------------------------------------------------

Teste de Mesa 2:
Entrada:
Operações: incluir [10,5,7], ordenar, mostrar, pesquisar 5, excluir 5, mostrar

Passo a passo:
Após inclusões -> vet = [10,5,7]
Opção 6 ordena -> [5,7,10]
Opção 5 mostra nessa ordem
Pesquisar 5 encontra posição 0
Excluir remove posição 0 -> vetor passa a [7,10]
Mostrar imprime dois valores

Saída:
Mensagens de ordenação implícitas, confirmações de pesquisa/exclusão e listagens correspondentes

---------------------------------------------------

Teste de Mesa 3:
Entrada:
Operações: incluir 50 valores até encher, tentar incluir mais um, inverter, mostrar

Passo a passo:
Após 50 inclusões -> posFim = 50
Nova tentativa acusa vetor cheio
Opção 7 inverte a ordem
Opção 5 mostra os 50 valores na ordem inversa

Saída:
Confirmações das inclusões, mensagem de vetor cheio, listagem final invertida
*/
