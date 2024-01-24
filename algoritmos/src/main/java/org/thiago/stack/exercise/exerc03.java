package org.thiago.stack.exercise;

import java.util.Stack;

public class exerc03 {

    public static void main(String[] args) {

        imprimeResultado("A + B");
        imprimeResultado("A + B + (C - D]");
    }

    final static String ABRE = "([{";
    final static String FECHA = ")]}";

    public static void imprimeResultado(String expressao){
        StringBuilder sb = new StringBuilder();
        StringBuilder append = sb.append(expressao).append(" esta balanceado? ").append(verificaSimbolosBalanceados(expressao));
        System.out.println(append);

    }
    public static boolean verificaSimbolosBalanceados(String expressao) {

        Stack<Character> pilha = new Stack<>();
        int index = 0;
        char simbolo, topo;

        while (index < expressao.length()) {
            simbolo = expressao.charAt(index);

            if (ABRE.indexOf(simbolo) > -1) {
                pilha.push(simbolo);
            } else if (FECHA.indexOf(simbolo) > -1) {
                if (pilha.empty()) {
                    return false;
                } else {
                    topo = pilha.pop();
                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)) {
                        return false;
                    }
                }
            }
            index++;
        }
        return true;
    }
}
