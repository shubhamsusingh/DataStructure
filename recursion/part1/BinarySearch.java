package recursion.part1;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, start, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, end);
        }
    }

    public static int search(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 8, 9, 10, 15, 20, 25 };
        System.out.println("Number Founded at Index" + search(arr, 5));
    }
}
