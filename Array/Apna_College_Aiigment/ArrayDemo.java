package Array.Apna_College_Aiigment;

import Array.Apna_College_Aiigment.Question;

import java.util.HashSet;

public class ArrayDemo {
    public static void main(String[] args) {
        Question q = new Question();
        int[] array = { 8, 7, 5, 9, 10 };
        System.out.println(q.checkDublicates(array));
        System.out.println(q.findIndex(array, 7));
        int[] array1 = { -1, 0, 1, 2, -1, -4 };
        System.out.println(q.price(array1));
        System.out.println(q.triplets(array1));
    }
}
