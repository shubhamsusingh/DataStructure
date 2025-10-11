package Array.Searching;

class LinearSearch {
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

    public static void main(String[] args) {
        int[] array = { 14, 16, 18, 20, 22 };
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println(linearSearch(array, 18));
        System.out.println(stringSearch("Shubham", 'k'));
    }
}