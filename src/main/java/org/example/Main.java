package org.example;

public class Main {
    String p[] = {"George Washington", "Abe Lincoln", "Herbert Hoover"};
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");

        for (int i = 0; i <= 3; i++) {
            System.out.println("i = " + i);
            System.out.println(p[i]);
        }
    }
}