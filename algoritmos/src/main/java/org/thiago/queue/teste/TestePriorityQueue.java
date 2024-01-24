package org.thiago.queue.teste;

import org.thiago.queue.exercise.model.Pessoa;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestePriorityQueue {

    public static void main(String[] args) {

        Queue<Pessoa> queue = new PriorityQueue<>();

        queue.add(new Pessoa("A", 2));
        queue.add(new Pessoa("B", 1));

        System.out.println(queue);
    }
}
