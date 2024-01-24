package org.thiago.stack;

import org.thiago.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

    public Pilha(int capacidade) {
        super(capacidade);
    }

    public Pilha() {
        super();
    }

    public void empilha(T elemento){
        super.adiciona(elemento);
    }

    public T topo(){
        if(this.estaVazia()){
            return null;
        }
        return this.elementos[tamanho-1];
    }

    public T desempilha(){

        if(this.estaVazia()){
            return null;
        }

        T elemento = elementos[tamanho-1];
        tamanho--;
        return elemento;
    }
}
