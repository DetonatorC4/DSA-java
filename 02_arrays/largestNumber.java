
public class largestNumber {

    public static int getLargest(int numbers[]) {

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        System.out.println("The smallest number is " + smallest);
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 81, 5, 7, 1, 69, 112, 8, 9 };
        int largest = getLargest(numbers);
        System.out.println("Largest number is " + largest);
    }
}
