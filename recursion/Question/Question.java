package recursion.Question;

public class Question {
    public static void print_n_1(int n) {

        System.out.println(n);
        if (n <= 1) {
            return;
        }
        print_n_1(n - 1);
    }

    public static void print_1_n(int n) {
        if (n == 0) {
            return;
        }
        print_1_n(n - 1);
        System.out.println(n);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }

    public static int sumOfN(int n) {
        if (n == 0) {
            return n;
        }
        return n % 10 + sumOfN(n / 10);
    }

    public static void main(String[] args) {
        print_1_n(5);
        System.out.println(factorial(5));
        System.out.printf("Sum of %d = %d", 12345, sumOfN(12345));
    }
}
