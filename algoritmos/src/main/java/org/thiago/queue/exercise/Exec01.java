package org.thiago.queue.exercise;

import org.thiago.queue.exercise.model.DocumentEx01;

import java.util.LinkedList;
import java.util.Queue;

public class Exec01 {

    public static void main(String[] args) {

        Queue<DocumentEx01> queue = new LinkedList<>();

        queue.add(new DocumentEx01("xubirubiral", 10));
        queue.add(new DocumentEx01("xubirubiru", 7));
        queue.add(new DocumentEx01("quincas berro dagua", 9));

        for (int i = queue.size(); i > 0; i--) {
            DocumentEx01 doc = queue.remove();
            System.out.println("imprimindo: " + doc.getName());
            try {
                Thread.sleep(200L * doc.getQnty());
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
