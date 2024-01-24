package org.thiago.recursividade;

public class Somatorio {

    public static void main(String[] args) {

        System.out.println(somatorioRec(5));
    }

    public static int somatorio(int num){
        int total = 0;

        for (int i = 1; i <= num; i++) {
            total += i;
        }

        return total;
    }

    public static int somatorioRec(int num){

        if(num == 0){
            return 0;
        }

        return num + somatorioRec(num - 1);
    }
}
