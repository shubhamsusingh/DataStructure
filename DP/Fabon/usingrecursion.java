package DP.Fabon;

import java.util.Scanner;

public class usingrecursion {
    static int fab(int n, int[] arr) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (arr[n] != 0) {
            return arr[n];
        }
        arr[n] = fab(n - 1, arr) + fab(n - 2, arr);
        return arr[n];
    }

    static void printFabo(int n, int arr[]) {
        System.out.println("\n");
        for (int i = 0; i < n; i++) {
            System.out.print(fab(i, arr) + " ");
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        printFabo(n, arr);
    }
}
