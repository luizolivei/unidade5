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
Teste de Mesa 1:
Entrada:
alturaChico = 1.50, alturaZe = 1.10

Passo a passo:
Cada ano → Chico cresce 0.02 m, Zé cresce 0.03 m
Após 41 iterações → alturaChico = 1.50 + 0.02*41 = 2.32 → alturaZe = 1.10 + 0.03*41 = 2.33
Condição alturaZe <= alturaChico deixa de ser verdadeira → laço termina

Saída:
Serao necessarios 41 anos

---------------------------------------------------

Teste de Mesa 2:
Entrada:
alturaChico = 1.50, alturaZe = 1.60 (hipótese)

Passo a passo:
Se alturaZe já fosse maior que alturaChico → condição do while seria falsa de início → anos = 0
No código atual os valores são fixos, mas o raciocínio mostra que o laço depende da comparação

Saída esperada nessa hipótese:
Serao necessarios 0 anos

---------------------------------------------------

Teste de Mesa 3:
Entrada:
Valores padrão

Passo a passo:
Após 40 anos → alturaChico = 2.30, alturaZe = 2.30 → condição ainda verdadeira
Ano seguinte (41º) → alturas 2.32 e 2.33 → alturaZe supera Chico → laço encerra

Saída:
Serao necessarios 41 anos
*/
