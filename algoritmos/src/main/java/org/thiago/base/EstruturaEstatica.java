package org.thiago.base;

public class EstruturaEstatica <T> {

    protected T[] elementos;
    protected int tamanho;

    public EstruturaEstatica(int capacidade){
        this.elementos =  (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    public EstruturaEstatica(){
        this(10);
    }

    protected boolean adiciona(T elemento)  {
        aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected boolean adiciona(int posicao, T elemento){
        if(posicao >= 0 && posicao <= this.tamanho) {
            aumentaCapacidade();
            for (int i = this.tamanho; i >= posicao; i--) {
                this.elementos[i + 1] = this.elementos[i];
            }
            this.elementos[posicao] = elemento;
            this.tamanho++;
            return true;
        }
        throw new IllegalArgumentException("Posicao invalida");
    }

    public void remove(int posicao){
        if(posicao >= 0 && posicao < this.tamanho){
            for (int i = posicao; i < this.elementos.length-1; i++) {
                this.elementos[i] = this.elementos[i +1];
            }
            this.tamanho--;
        } else {
            throw new IllegalArgumentException("Posicao invalida");
        }
    }

    public int getTamanho(){
        return this.tamanho;
    }

    protected void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] novosElementos = (T[]) new Object[this.elementos.length * 2];
            for (int i = 0; i < elementos.length; i++) {
                novosElementos[i] = this.elementos[i];
            }
            this.elementos = novosElementos;
        }
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i = 0; i < tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if (this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }
}
