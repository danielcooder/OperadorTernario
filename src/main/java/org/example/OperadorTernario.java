package org.example;

public class OperadorTernario {
    public static void main(String[] args) {
        int n1, n2, r;

        n1 = 25;
        n2 = 14;
        r = (n1>n2)?n1+n2:n1-n2;

        System.out.println("O resultado é " + r);

    }

}