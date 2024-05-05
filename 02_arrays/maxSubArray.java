public class maxSubArray {

    public static int getMaxArray(int numbers[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                int tempSum = 0;
                for (int k = i; k <= j; k++) {
                    tempSum += numbers[k];
                }
                System.out.println(tempSum);
                if (tempSum > maxSum) {
                    maxSum = tempSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        int maxSumValue = getMaxArray(numbers);
        System.out.println("The sum of max sub-array is " + maxSumValue);
    }
}
