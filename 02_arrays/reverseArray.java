public class reverseArray {

    public static void reverseFOR(int numbers[]) {
        // int start = 0, end = numbers.length - 1;

        for (int i = 0; i < (numbers.length) / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - 1 - i] = temp;
        }

    }

    public static void reverseWHILE(int numbers[]) {
        int first = 0, last = numbers.length - 1;
        while (first < last) {
            int temp = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = temp;

            first++;
            last--;
        }
    }

    public static void print(int numbers[]) {
        System.out.print("The array is : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        print(numbers);
        // reverseFOR(numbers);
        reverseWHILE(numbers);
        print(numbers);
    }
}
