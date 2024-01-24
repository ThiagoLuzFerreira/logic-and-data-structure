package org.thiago.array.teste;

import org.thiago.array.Vetor;

public class TesteArray {

    public static void main(String[] args) {

        Vetor vetor = new Vetor(3);

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 4");

        //System.out.println(vetor.getTamanho());
        //System.out.println(vetor);
        //System.out.println(vetor.busca(0));
        //System.out.println(vetor.busca("elemento "));
//        System.out.println(vetor);
//        System.out.println(vetor.adiciona(0, "elemento 0"));
//        System.out.println(vetor);
//        System.out.println(vetor.adiciona(3, "elemento 3"));
//        System.out.println(vetor);
//        System.out.println(vetor.adiciona(5, "elemento 5"));
//        System.out.println(vetor);


        System.out.println(vetor);

        vetor.remove(3);

        System.out.println(vetor);

    }
}
