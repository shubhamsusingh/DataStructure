// package TreeQuetion;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Index i = new Index();
        i.insert(10);
        i.insert(5);
        i.insert(2);
        i.insert(7);
        i.insert(12);
        i.insert(9);
        i.insert(15);
        i.insert(1);
        ArrayList<Integer> list = i.BFS(i.root);
        System.err.println(list);
        System.out.println(i.checkUniValue(i.root));
    }
}
