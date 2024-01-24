package org.thiago.recursividade;

public class Main {
    public static void main(String[] args) {



        Integer num = null;

        if(num != null){
            System.out.println("Resultado do fatorial: " + fatorial(5));
        }

        System.out.println("Resultado do fatorial: " + fatorial(6));
    }


    public static int calcularFatorial(int num){
        int total = 1;
        for (int i = num; i > 1 ; i--) {
            total *= i;
        }
        return total;
    }

    public static int fatorial(int num){
        if(num == 0){
            return 1;
        }
        return num * fatorial(num - 1);
    }
}