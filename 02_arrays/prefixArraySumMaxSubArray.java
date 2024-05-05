public class prefixArraySumMaxSubArray {

    public static int maxSubArray(int numbers[]) {
        int prefix[] = new int[numbers.length];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        // Prefix Array
        prefix[0] = numbers[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for (int i = 0; i < numbers.length; i++) {
            currSum = 0;
            for (int j = i; j < numbers.length; j++) {
                if (i == 0) {
                    currSum = prefix[j];
                } else {
                    currSum = prefix[j] - prefix[i - 1];
                }
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int numbers[] = { 1, -2, 6, -1, 3 };
        int maxSum = maxSubArray(numbers);

        System.out.println("The max of sub-arrays : " + maxSum);
    }
}
