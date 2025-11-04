package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a1,a2,a3;
        a1 = 0;
        a2 = 1;
        a3 = a1 + a2;
        System.out.print("count:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i<= num; i++) {
            if (i == 1)
                System.out.print(a1 + ",");
            else if (i == 2)
                System.out.print(a2 + ",");
            else {
                a3 = a1 + a2;
                System.out.print(a3 + ",");
                a1 = a2;
                a2 = a3;
            }
        }
    }
}