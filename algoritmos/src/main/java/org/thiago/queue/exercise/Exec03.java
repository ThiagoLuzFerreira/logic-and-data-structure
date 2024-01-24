package org.thiago.queue.exercise;

import org.thiago.queue.FilaComPrioridade;
import org.thiago.queue.exercise.model.Pessoa;

import java.util.PriorityQueue;
import java.util.Queue;

public class Exec03 {

    private static int VERMELHO = 0;
    private static int AMARELO = 1;
    private static int VERDE = 2;


    public static void main(String[] args) {

        FilaComPrioridade<Pessoa> queue = new FilaComPrioridade<>();


        queue.enfileira(new Pessoa("Pessoa 1", AMARELO));
        queue.enfileira(new Pessoa("Pessoa 2", VERDE));
        queue.enfileira(new Pessoa("Pessoa 3", VERMELHO));
        queue.enfileira(new Pessoa("Pessoa 4", AMARELO));
        queue.enfileira(new Pessoa("Pessoa 5", AMARELO));
        queue.enfileira(new Pessoa("Pessoa 6", VERMELHO));

        PSAtendimento atendimento = new PSAtendimento(queue);
        PSNovosPacientes pacientes = new PSNovosPacientes(queue);

        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);
        t1.start();
        t2.start();
    }
}
