package string.pelindrome;

public class Pelindrome {
    public static boolean isPelindrome(String text) {
        if (text.length() <= 1) {
            return true;
        }
        int start = 0;
        int end = text.length() - 1;
        while (start <= end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start = start + 1;
            end = end - 1;
        }
        return true;
    }

    public static void main(String[] args) {
        String text = "ABC";
        System.out.println(isPelindrome(text));

    }
}
