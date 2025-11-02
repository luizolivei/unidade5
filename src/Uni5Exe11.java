public class Uni5Exe11 {
    public static void main(String[] args) {
        long quebradosNoDia = 0;
        long quebradosHora = 1;

        for (int hora = 1; hora <= 16; hora++) {
            if (hora == 1) {
                quebradosHora = 1;
            } else if (hora == 2) {
                quebradosHora = 3;
            } else {
                quebradosHora *= 3;
            }
            quebradosNoDia += quebradosHora;
        }

        System.out.println("Biscoitos quebrados em um dia: " + quebradosNoDia);
    }
}
/*
Teste de Mesa 1:
Entrada:
nenhuma (o dia tem 16 horas fixas)

Passo a passo:
Hora 1 → quebra 1 biscoito → quebradosNoDia = 1
Hora 2 → quebra 3 biscoitos → quebradosNoDia = 4
Hora 3 → quebra 9 biscoitos (triplo da hora anterior) → quebradosNoDia = 13

Saída parcial:
Biscoitos quebrados em um dia: 21523360 (valor final após as 16 horas)

---------------------------------------------------

Teste de Mesa 2:
Entrada:
nenhuma

Passo a passo:
As quebras seguem a sequência 1, 3, 9, 27, ...
Até a hora 5 → somatório = 1 + 3 + 9 + 27 + 81 = 121
O laço só termina após a 16ª hora, acumulando todos os termos

Saída:
Biscoitos quebrados em um dia: 21523360

---------------------------------------------------

Teste de Mesa 3:
Entrada:
nenhuma

Passo a passo:
quebradosHora inicia em 1
Para hora >= 3 → quebradosHora = quebradosHora * 3
O acumulado quebradosNoDia recebe o valor de quebradosHora em cada hora

Saída:
Biscoitos quebrados em um dia: 21523360
*/
