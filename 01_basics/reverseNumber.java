public class reverseNumber {
    public static void main(String[] args) {
        int n = 12345;
        int reverseN = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            n = n / 10;
            reverseN = reverseN * 10 + lastDigit;
        }
        System.err.println(reverseN);
    }
}