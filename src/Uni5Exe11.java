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
// Teste de mesa 1: horas 1 a 3 geram 1 3 9 soma=13
// Teste de mesa 2: duas horas gera 1+3=4
// Teste de mesa 3: dezesseis horas soma geométrica encerrada
