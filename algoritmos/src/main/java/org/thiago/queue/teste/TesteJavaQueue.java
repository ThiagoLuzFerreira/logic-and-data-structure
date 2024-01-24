package org.thiago.queue.teste;

import java.util.LinkedList;
import java.util.Queue;

public class TesteJavaQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue);

        //queue.remove();

        //System.out.println(queue);
        queue.removeIf(q -> q == 2);

        System.out.println(queue);

    }
}
