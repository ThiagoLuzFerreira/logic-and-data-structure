package org.thiago.stack.exercise;

import java.util.Stack;

public class exerc04 {

    public static void main(String[] args) {

        System.out.println(decimalBinario(25));

    }

    public static String decimalBinario(int decimal){

        Stack<Integer> mods = new Stack<>();
        String binary = "";

        while (decimal > 0){
            int rest = decimal%2;
            mods.push(rest);
            decimal /= 2;
        }

        while(!mods.empty()){
            binary += mods.pop();
        }

        return binary;
    }
}
