package Array.Searching;

class LinearSearch {
    // Integer Search:-
    public static int linearSearch(int[] array, int target) {
        if (array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // String Search:-
    public static boolean stringSearch(String string, char target) {
        if (string.length() == 0) {
            return false;
        }
        for (int i = 0; i < string.length(); i++) {
            if (target == string.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    // Search in range:-
    public static int findRange(int[] array, int target, int start, int end) {
        if (array.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (array[i] == target) {
                return array[i];
            }
        }
        return -1;
    }

    // FindMinValue:-
    public static int findMin(int[] array) {
        int ans = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < ans) {
                ans = array[i];
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] array = { 14, 16, 18, 20, 22 };
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(linearSearch(array, 18));
        System.out.println(stringSearch("Shubham", 'k'));
        System.out.println(findRange(array, 19, 2, 4));
    }
}