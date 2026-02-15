package heapSort;

public class Index {
    static class heap {
        public void heapify(int[] arr, int max, int size) {
            int left = 2 * max + 1;
            int right = 2 * max + 2;
            int maxIndex = max;
            if (left < size && arr[left] > arr[maxIndex]) {
                maxIndex = left;
            }
            if (right < size && arr[right] > arr[maxIndex]) {
                maxIndex = right;
            }
            if (maxIndex != max) {
                int temp = arr[maxIndex];
                arr[maxIndex] = arr[max];
                arr[max] = temp;
                heapify(arr, maxIndex, size);
            }

        }

        public void heapSort(int[] arr) {
            int n = arr.length;
            for (int i = n / 2; i >= 0; i--) {
                heapify(arr, i, n);
            }
            for (int i = n - 1; i > 0; i--) {
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                heapify(arr, 0, i);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 8, 3, 1, 9, 4, 6 };
        heap h = new heap();
        h.heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
