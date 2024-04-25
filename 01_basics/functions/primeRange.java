package functions;

public class primeRange {
    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (prime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static boolean prime(int n) {

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        primesInRange(20);

    }
}
