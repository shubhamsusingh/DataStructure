package Array.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] array, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            return binarySearch(array, mid + 1, end, target);
        } else {
            return binarySearch(array, start, mid - 1, target);
        }
    }

    public static int ceiling(int[] array, int start, int end, int target) {
        if (start > end) {
            return start;
        }
        int mid = start + (end - start) / 2;

        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            return ceiling(array, mid + 1, end, target);
        } else {
            return ceiling(array, start, mid - 1, target);
        }
    }

    public static int floor(int[] array, int start, int end, int target) {
        if (start > end) {
            return end;
        }
        int mid = start + (end - start) / 2;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] < target) {
            return floor(array, mid + 1, end, target);
        } else {
            return floor(array, start, mid - 1, target);
        }
    }

    public static int[] findFirstAndLast(int[] array, int target) {
        int first = first(array, target);
        int last = last(array, target);
        return new int[] { first, last };
    }

    public static int first(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                ans = mid;
                end = mid - 1;
            }
            if (array[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static int last(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target) {
                ans = mid;
                start = mid + 1;
            }
            if (array[mid] < target) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] array = { 1, 3, 4, 5, 6, 7, 8, 8, 9, 10 };
        System.out.println(array[binarySearch(array, 0, array.length - 1, 10)]);
        System.out.println(array[ceiling(array, 0, array.length - 1, 2)]);
        System.out.println(array[floor(array, 0, array.length - 1, 2)]);
        System.out.println(Arrays.toString(findFirstAndLast(array, 8)));

    }
}
