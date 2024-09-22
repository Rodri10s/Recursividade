package com.ramon.ifba;

import java.util.Scanner;
import java.util.Stack;

public class recusao {
    static Stack<Integer> pilha = new Stack<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número decimal");
        int decimal = input.nextInt();
        conversor(decimal);
    }

    public static void conversor(int decimal) {
        if (decimal == 1) {
            pilha.add(1);
            while (!pilha.isEmpty()) {
                System.out.print(pilha.pop());
            }
            System.out.println();
        } else if (decimal == 0) {
            pilha.add(0);
            while (!pilha.isEmpty()) {
                System.out.print(pilha.pop());
            }
            System.out.println();
        } else {
            int resto = decimal % 2;
            int prox = decimal / 2;
            pilha.add(resto);
            conversor(prox);
        }
    }
}
