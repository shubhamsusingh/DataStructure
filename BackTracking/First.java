package BackTracking;

import java.util.Scanner;

public class First {
    static void change(int[] arr, int index, int val) {
        if (index == arr.length) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            return;
        }
        arr[index] = val;
        change(arr, index + 1, val + 1);
        arr[index] = arr[index] - 2;
    }

    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many element you want ");
        s = sc.nextInt();
        int[] arr = new int[s];
        change(arr, 0, 1);
        print(arr);
        sc.close();
    }
}
