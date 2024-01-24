package org.thiago.stack.exercise;

import java.util.Stack;

public class exerc02 {

    public static void main(String[] args) {

        imprimeResultado("ADA" );
        imprimeResultado("ABCD");

    }

    public static void imprimeResultado(String palavra){
        System.out.println(palavra + " e palindromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra){

        Stack<Character> pilha = new Stack<>();

        for (int i = 0; i < palavra.length(); i++){
            pilha.push(palavra.charAt(i));
        }

        String palavraInversa = "";
        while (!pilha.empty()){
            palavraInversa += pilha.pop();
        }

        if(palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }

        return false;
    }
}
