package org.thiago.stack.teste;

import org.thiago.stack.Pilha;

public class TestePilha {

    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();

        for (int i = 0; i < 10 ; i++) {
            pilha.empilha(i);
        }

        System.out.println(pilha);
        //System.out.println(pilha.getTamanho());
        //System.out.println(pilha.estaVazia());
        //System.out.println(pilha.topo());

        System.out.println(pilha.desempilha());
        System.out.println(pilha);
        System.out.println(pilha.getTamanho());

    }
}
