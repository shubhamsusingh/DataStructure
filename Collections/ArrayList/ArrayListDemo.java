package Collections.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Banana");
        list.add("Apple");
        list.add(0, "Fruits");
        System.out.println(list.get(0));
        list.add(list.size(), "Last");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        list.set(list.size() - 1, "Orange");
        System.out.println(list);
        list.add(0, "Orange");
        System.out.println(list.indexOf("Orange"));
        System.out.println(list.lastIndexOf("Orange"));
        System.out.println(list.isEmpty());
        for (String element : list) {
            System.out.print(element + " ");
        }

    }

}
