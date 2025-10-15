package Array.BinarySearch;

public class SearchWithoutIndex {
    public static int search(int[] array, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int ans(int[] array, int target) {
        int start = 0;
        int end = 1;
        while (target > array[end]) {
            int temp = end + 1;
            end = start + (end - start + 1) * 2;
            start = temp;
        }
        return search(array, target, start, end);
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(ans(array, 6));
    }
}
