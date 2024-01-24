package org.thiago.array.teste;

import org.thiago.array.Lista;

public class TesteLista {

    public static void main(String[] args) {

        Lista<String> lista = new Lista<>(2);

        lista.adiciona("karine");
        lista.adiciona("thiago");

        System.out.println(lista.contem("thiago"));

    }
}
