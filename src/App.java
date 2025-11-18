public class App {
    public static void main(String[] args) throws Exception {
        Exemplo.main(args);
    }
}

/*
Teste de Mesa 1:
Entrada:
args = [] (sem argumentos)

Passo a passo:
main é executado -> chama Exemplo.main([])
Exemplo instancia Exemplo -> imprime a data atual, o último dia de aula e o tempo até o Natal considerando o dia de execução

Saída:
Mesmos textos produzidos por Exemplo para a data corrente

---------------------------------------------------

Teste de Mesa 2:
Entrada:
args = ["teste"]

Passo a passo:
App ignora o conteúdo do vetor -> encaminha o mesmo vetor para Exemplo.main
Exemplo executa normalmente mostrando as mesmas mensagens dependentes da data atual

Saída:
Mensagens formatadas produzidas por Exemplo conforme a data corrente

---------------------------------------------------

Teste de Mesa 3:
Entrada:
args = null (não utilizado)

Passo a passo:
Java invoca main com args = null -> Exemplo.main também é chamado com null
Exemplo não usa o parâmetro -> imprime a data atual, dias restantes e semanas até o Natal

Saída:
Mesmas mensagens exibidas por Exemplo considerando a data do sistema
*/
