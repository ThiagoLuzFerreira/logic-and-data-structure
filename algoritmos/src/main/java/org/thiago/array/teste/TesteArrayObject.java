package org.thiago.array.teste;

import org.thiago.array.VetorObject;

public class TesteArrayObject {

    public static void main(String[] args) {

        VetorObject vetor = new VetorObject(3);

        vetor.adiciona("eu");
        vetor.adiciona(4);
        vetor.adiciona(5);

        System.out.println(vetor);
    }
}
