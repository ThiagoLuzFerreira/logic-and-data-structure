package org.thiago.queue;

import org.thiago.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

    public Fila() {
    }

    public Fila(int capacidade) {
        super(capacidade);
    }

    public void enfileira(T elemento){
        this.adiciona(elemento);
    }

    public T espia(){
        if(this.tamanho > 0){
            return this.elementos[0];
        } else {
            throw new NullPointerException("fila vazia");
        }
    }

    public T desenfileira(){

        final int POS = 0;

        if (this.estaVazia()){
            return null;
        }

        T elementoASerRemovido = this.elementos[0];

        this.remove(POS);

        return elementoASerRemovido;
    }
}
