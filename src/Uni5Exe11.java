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
Teste de Mesa:
Entrada:
nenhuma, esta fixo 16 horas

Passo a passo:
Hora 1 -> quebra 1 biscoito -> quebradosNoDia = 1
Hora 2 -> quebra 3 biscoitos -> quebradosNoDia = 4
Hora 3 -> quebra 9 biscoitos -> quebradosNoDia = 13
e por ai vai

Saida:
Biscoitos quebrados em um dia: 21523360
*/
