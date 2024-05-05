public class binarySearch {

    public static int binarySearchFunction(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // comparisons
            while (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 110, 12, 14, 16, 18 };
        int key = 110;

        int index = binarySearchFunction(numbers, key);

        System.out.println("Index for key is " + index);
    }
}
