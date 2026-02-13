package heap;

import java.util.ArrayList;

public class Index {

    static class heap {
        ArrayList<Integer> list = new ArrayList<>();

        public void add(int val) {
            list.add(val);
            int x = list.size() - 1;
            int pren = (x - 1) / 2;
            while (x > 0 && list.get(x) < list.get(pren)) {
                int temp = list.get(x);
                list.set(x, list.get(pren));
                list.set(pren, temp);
                x = pren;
                pren = (pren - 1) / 2;
            }
        }

        public void heapify(int root) {
            int left = (2 * root + 1);
            int right = 2 * root + 2;
            int minIndex = root;
            if (left < list.size() && list.get(minIndex) > list.get(left)) {
                minIndex = left;
            }
            if (right < list.size() && list.get(minIndex) > list.get(right)) {
                minIndex = right;
            }
            if (root != minIndex) {
                int temp = list.get(minIndex);
                list.set(minIndex, list.get(root));
                list.set(root, temp);
                heapify(minIndex);
            }
        }

        public int remove() {
            int data = list.get(0);
            int temp = list.get(0);
            list.set(0, list.get(list.size() - 1));
            list.set(list.size() - 1, temp);
            list.remove(list.size() - 1);
            // fix heap
            if (!list.isEmpty()) {
                heapify(0);
            }

            return data;
        }

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public int peek() {

            return list.get(0);
        }
    }

    public static void main(String[] args) {
        heap h = new heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }

    }
}
