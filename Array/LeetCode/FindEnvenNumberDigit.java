public class FindEnvenNumberDigit {
    public static int findEvenDigit(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            int countIneer = 0;
            while (num > 0) {
                countIneer++;
                num = num / 10;
            }
            if (countIneer % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] num = { 14, 151, 20, 14, 88, 102 };
        System.out.println(findEvenDigit(num));
    }
}
