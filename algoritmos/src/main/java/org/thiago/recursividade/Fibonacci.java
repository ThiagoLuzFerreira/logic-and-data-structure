package org.thiago.recursividade;

public class Fibonacci {

    public static void main(String[] args) {

        //System.out.println(fibonacci(10));

        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacciRecursivo(i));
        }
    }

    private static int fibonacci(int num){

        if(num <= 1){
            return num;
        }

        int total = 0;
        int anterior = 0;
        int atual = 1;

        for (int i = 2; i <= num; i++) {
            total = anterior + atual;
            anterior = atual;
            atual = total;
        }
        return total;
    }

    public static int fibonacciRecursivo(int num){

        if(num < 2 ){
            return 1;
        }

        return fibonacciRecursivo(num-1) + fibonacciRecursivo(num-2);
        }
}
