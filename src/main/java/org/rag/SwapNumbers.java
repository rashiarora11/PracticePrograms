package org.rag;

public class SwapNumbers {

    public static void main(String[] args) {

        //Using third variable
        int a = 9;
        int b = 8;
        int c;

        c = a;
        a = b;
        b = c;

        System.out.println("Swapped Numbers: " + a + " " + b);

        //Without using third variable

        int a1 = 9;
        int b1 = 8;

        a1 = a1 + b1;
        b1 =  a1-b1;
        a1 = a1 - b1;

        System.out.println("Swapped Numbers: " + a1 + " " + b1);

    }

}