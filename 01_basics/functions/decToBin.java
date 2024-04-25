public class decToBin {

    public static int convert(int decNumber) {
        int binary = 0;
        int power = 0;

        while (decNumber > 0) {
            int digit = decNumber % 2;
            binary += digit * Math.pow(10, power);
            power++;
            decNumber /= 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        System.out.println(convert(5));
    }
}
