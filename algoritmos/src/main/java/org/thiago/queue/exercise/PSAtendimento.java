package org.thiago.queue.exercise;

import org.thiago.queue.FilaComPrioridade;
import org.thiago.queue.exercise.model.Pessoa;

public class PSAtendimento implements Runnable{

    private FilaComPrioridade<Pessoa> fila;

    public PSAtendimento(FilaComPrioridade<Pessoa> fila) {
        this.fila = fila;
    }

    @Override
    public void run() {
        while (!fila.estaVazia()){

            System.out.println(fila.desenfileira() + " atendida");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
