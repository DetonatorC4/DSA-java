public class binToDec {

    public static int convert(int binNumber) {
        int dec = 0;
        int power = 0;

        while (binNumber > 0) {
            int digit = binNumber % 10;
            dec += digit * Math.pow(2, power);
            binNumber /= 10;
            power++;
        }

        return dec;
    }

    public static void main(String[] args) {
        int num = 111;
        System.out.println("Decimal of " + num + " : " + convert(num));
    }
}
