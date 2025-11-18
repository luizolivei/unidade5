import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Exemplo {
    public Exemplo() {
        // Data atual
        LocalDate hoje = LocalDate.now();
        System.out.println("Data de hoje: " + hoje);

        //Formatar a data
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data de hoje: " + hoje.format(formato));

        //Calcular ultimo dia de aula
        LocalDate ultimoDiaFurb = LocalDate.of(hoje.getYear(), 12, 3);

        long dias = ChronoUnit.DAYS.between(hoje, ultimoDiaFurb);

        System.out.println("Faltam " + dias + " dias para o ultimo dia de Aula!");

        // Calcular dias até o Natal
        LocalDate natal = LocalDate.of(hoje.getYear(), 12, 24);

        dias = ChronoUnit.DAYS.between(hoje, natal);
        long semana = ChronoUnit.WEEKS.between(hoje, natal);
        System.out.println("Faltam " + semana + " semanas para o Natal!");
    }

    public static void main(String[] args) {
        new Exemplo();
    }
}

/*
Teste de Mesa 1:
Entrada:
Data do sistema = 01/10/2023

Passo a passo:
hoje = 2023-10-01 -> imprime "Data de hoje: 2023-10-01" e "Data de hoje: 01/10/2023"
ultimoDiaFurb = 03/12/2023 -> ChronoUnit calcula 63 dias restantes
natal = 24/12/2023 -> dias = 84 -> semanas = 12

Saída:
Data de hoje e formato -> "Faltam 63 dias para o ultimo dia de Aula!" -> "Faltam 12 semanas para o Natal!"

---------------------------------------------------

Teste de Mesa 2:
Entrada:
Data do sistema = 15/11/2023

Passo a passo:
hoje = 2023-11-15 -> imprime data no formato padrão e formatada
ultimoDiaFurb = 03/12/2023 -> faltam 18 dias
natal = 24/12/2023 -> faltam 39 dias -> 5 semanas completas

Saída:
Mensagens com data atual 15/11/2023, "Faltam 18 dias ..." e "Faltam 5 semanas ..."

---------------------------------------------------

Teste de Mesa 3:
Entrada:
Data do sistema = 30/12/2023

Passo a passo:
hoje = 2023-12-30 -> imprime datas
ultimoDiaFurb = 03/12/2023 -> dias = -27 (já passou) -> mensagem "Faltam -27 dias ..."
natal = 24/12/2023 -> semanas = -1

Saída:
Mostra data atual 30/12/2023 e valores negativos indicando que os eventos já ocorreram
*/
