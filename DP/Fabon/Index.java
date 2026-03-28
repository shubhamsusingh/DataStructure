package DP.Fabon;

import java.util.Scanner;

public class Index {
    static void printFabo(int num) {
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second);
        for (int i = 2; i < num; i++) {
            int next = first + second;
            System.out.print(" " + next + " ");
            first = second;
            second = next;
        }

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        printFabo(n);
    }

}
