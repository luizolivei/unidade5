import java.util.Scanner;

public class Uni6Exe05 {
    private static final int QUESTIONS = 5;

    public static void main(String[] args) {
        new Uni6Exe05().run();
    }

    private void run() {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] boyAnswers = readAnswers(scanner);
            String[] girlAnswers = readAnswers(scanner);
            int affinity = calculateAffinity(boyAnswers, girlAnswers);
            System.out.println("Afinidade: " + affinity);
            System.out.println(determineMessage(affinity));
        }
    }

    private String[] readAnswers(Scanner scanner) {
        String[] answers = new String[QUESTIONS];
        for (int i = 0; i < QUESTIONS; i++) {
            answers[i] = normalize(scanner.next());
        }
        return answers;
    }

    private String normalize(String answer) {
        return answer.trim().toUpperCase().replace('Ã', 'A').replace('Õ', 'O');
    }

    private int calculateAffinity(String[] boyAnswers, String[] girlAnswers) {
        int affinity = 0;
        for (int i = 0; i < QUESTIONS; i++) {
            String boy = boyAnswers[i];
            String girl = girlAnswers[i];
            if (boy.equals(girl)) {
                affinity += 3;
            } else if (boy.equals("IND") || girl.equals("IND")) {
                affinity += 1;
            } else if ((boy.equals("SIM") && girl.equals("NAO")) || (boy.equals("NAO") && girl.equals("SIM"))) {
                affinity -= 2;
            }
        }
        return affinity;
    }

    private String determineMessage(int affinity) {
        if (affinity >= 15) {
            return "Casem!";
        }
        if (affinity >= 10) {
            return "Vocês têm muita coisa em comum!";
        }
        if (affinity >= 5) {
            return "Talvez não dê certo :(";
        }
        if (affinity >= 0) {
            return "Vale um encontro.";
        }
        if (affinity >= -9) {
            return "Melhor não perder tempo";
        }
        return "Vocês se odeiam!";
    }
}

/*
Teste de Mesa 1:
Entrada:
Menino = [SIM,SIM,SIM,SIM,SIM]
Menina = [SIM,SIM,SIM,SIM,SIM]

Passo a passo:
Todas as respostas iguais -> cada pergunta soma 3 -> afinidade = 15
determineMessage retorna "Casem!"

Saída:
"Afinidade: 15" e "Casem!"

---------------------------------------------------

Teste de Mesa 2:
Entrada:
Menino = [SIM,NAO,SIM,IND,NAO]
Menina = [NAO,NAO,IND,IND,SIM]

Passo a passo:
Q1: SIM x NAO -> -2 (afinidade -2)
Q2: NAO x NAO -> +3 (afinidade 1)
Q3: SIM x IND -> +1 (afinidade 2)
Q4: IND x IND -> +3 (afinidade 5)
Q5: NAO x SIM -> -2 (afinidade 3)
Mensagem: "Vale um encontro."

Saída:
"Afinidade: 3" seguido de "Vale um encontro."

---------------------------------------------------

Teste de Mesa 3:
Entrada:
Menino = [IND,IND,IND,IND,IND]
Menina = [NAO,NAO,NAO,NAO,NAO]

Passo a passo:
Cada comparação IND vs NAO adiciona 1 -> afinidade final = 5
Mensagem: "Talvez não dê certo :("

Saída:
"Afinidade: 5" e texto correspondente
*/
