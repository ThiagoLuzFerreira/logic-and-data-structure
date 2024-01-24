package org.thiago.array.teste;

import java.util.ArrayList;
import java.util.Arrays;

public class TesteArrayList {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.addAll(Arrays.asList("A", "B", "C"));

        boolean existe = arrayList.contains("Z");

        if(existe){
            System.out.println("tem o elemento");
        } else {
            System.out.println("nao tem o elemento");
        }

    }
}
