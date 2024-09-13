public class OddOrEven {

    public static void parityChecker(int n) {
        int bitMask = 1;
        if ((n & bitMask) == 0) {
            // even
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        parityChecker(20);
        parityChecker(21);
        parityChecker(202);
        parityChecker(2023);
    }
}
