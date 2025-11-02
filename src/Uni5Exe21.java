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
// Teste de mesa 1: alturas iniciais dadas resultado 41 anos
// Teste de mesa 2: se Ze começasse maior (ajuste mental) laço nao executaria
// Teste de mesa 3: verificacao manual apos 41 anos Ze ultrapassa Chico
