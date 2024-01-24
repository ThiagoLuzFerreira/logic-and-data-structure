package org.thiago.stack.exercise;

import java.util.Stack;

public class exerc01 {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                stack.push(i);
            } else if (i % 2 != 0) {
                stack.pop();
                if(stack.empty()){
                    System.out.println("stack vazia");
                }
            }
        }
        System.out.println(stack);
        if(!stack.empty()){
            for (int i = 0; i < stack.capacity(); i++) {
                if (stack.empty()){
                    break;
                }
                System.out.println(stack.pop());
            }
        }
    }
}
