package Collections.vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(2);
        v.add(3);
        System.out.println(v);
        v.add(0, 0);
        for (int num : v) {
            System.out.print(num + " ");
        }
        System.err.println("\nData at Index 3 : " + v.get(3));
        System.out.println(v.remove(3));
        System.out.println(v);
    }
}
