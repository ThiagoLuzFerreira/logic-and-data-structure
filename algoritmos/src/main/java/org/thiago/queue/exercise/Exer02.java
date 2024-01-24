package org.thiago.queue.exercise;

import java.util.LinkedList;
import java.util.Queue;

public class Exer02 {

    public static void main(String[] args) {

        Queue<String> normal = new LinkedList<>();
        Queue<String> priority = new LinkedList<>();

        final int MAX_PRIORITY = 3;

        normal.add("Pessoa 1");
        normal.add("Pessoa 2");
        normal.add("Pessoa 3");
        priority.add("Pessoa 1P");
        priority.add("Pessoa 2P");
        priority.add("Pessoa 3P");
        priority.add("Pessoa 4P");
        priority.add("Pessoa 5P");
        normal.add("Pessoa 4");
        normal.add("Pessoa 5");
        normal.add("Pessoa 6");
        normal.add("Pessoa 7");
        normal.add("Pessoa 8");
        normal.add("Pessoa 9");
        normal.add("Pessoa 10");

        if(!normal.isEmpty() || !priority.isEmpty()){
            for (int i = normal.size(); i > 0 ; i--) {
                if(!priority.isEmpty()){
                    for (int y = 0; y < MAX_PRIORITY; y++) {
                        atendeFila(priority);
                    }
                }

                if(!normal.isEmpty()){
                    atendeFila(normal);
                }

                for (int y = 0; y < MAX_PRIORITY; y++) {
                    if (priority.isEmpty()) {
                        break;
                    } else {
                        atendeFila(priority);
                    }
                }
            }
        }
        else {
            System.out.println("Filas vazias");
        }
    }

    private static void atendeFila(Queue<String> queue) {
        String pessoaAtendida = queue.remove();
        System.out.println(pessoaAtendida + " foi atendida");
    }
}