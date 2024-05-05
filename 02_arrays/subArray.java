public class subArray {

    public static void printSubArrays(int numbers[]) {
        int tsa = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(numbers[k] + " ");
                }
                tsa++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total sub arrays are : " + tsa);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        printSubArrays(numbers);
    }
}
