package org.thiago.queue.teste;

import org.thiago.queue.FilaComPrioridade;

public class TesteFilaComPrioridade {

    public static void main(String[] args) {

        FilaComPrioridade<Integer> filaComPrioridade = new FilaComPrioridade<>();

        filaComPrioridade.enfileira(2);
        filaComPrioridade.enfileira(1);

        System.out.println(filaComPrioridade);

    }
}
