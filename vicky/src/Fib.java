package vicky.src;

import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= n) {
            int fib = b;
            b = b + a;
            a = fib;
            count++;
        }
        System.out.println(b);
    }
    }

