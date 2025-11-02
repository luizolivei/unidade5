public class Uni5Exe21 {
    public static void main(String[] args) {
        double alturaChico = 1.50;
        double alturaZe = 1.10;
        double crescimentoChico = 0.02;
        double crescimentoZe = 0.03;
        int anos = 0;

        while (alturaZe <= alturaChico) {
            alturaChico += crescimentoChico;
            alturaZe += crescimentoZe;
            anos++;
        }

        System.out.println("Serao necessarios " + anos + " anos");
    }
}
/*
Teste de Mesa:
Entrada:
valores ja registrados na funcao

Passo a passo:
Cada ano -> Chico cresce 0.02 m, Zé cresce 0.03 m
Após 41 iterações -> alturaChico = 1.50 + 0.02*41 = 2.32 -> alturaZe = 1.10 + 0.03*41 = 2.33
Condição alturaZe <= alturaChico deixa de ser verdadeira -> laço termina

Saída:
Serao necessarios 41 anos
*/
