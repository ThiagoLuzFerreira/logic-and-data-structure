package org.thiago.queue.exercise;

import org.thiago.queue.FilaComPrioridade;
import org.thiago.queue.exercise.model.Pessoa;

import java.util.Random;

public class PSNovosPacientes implements Runnable{

    private FilaComPrioridade<Pessoa> fila;
    private int cont = 7;
    private Random prioridade = new Random();

    public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {

        for (int i = 0; i < 4; i++) {

            try {
                Thread.sleep(8000);
                Pessoa p = new Pessoa("Pessoa " + cont, prioridade.nextInt(3));
                fila.enfileira(p);
                cont++;
                System.out.println(p + " enfileirada");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
