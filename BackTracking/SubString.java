package BackTracking;

public class SubString {
    static void findSubString(String s, String result, int i) {
        if (i == s.length()) {
            if (result == "") {
                System.out.println("NULL");
            } else {
                System.out.println(result);
            }
            return;
        }
        findSubString(s, result + s.charAt(i), i + 1);
        findSubString(s, result, i + 1);
    }

    public static void main(String[] args) {
        String s = "Shubham";
        findSubString(s, "", 0);

    }
}