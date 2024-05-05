public class kadaneAlgoMaxSubArray {

    public static int kadansAlgo(int numbers[]) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            currSum += numbers[i];
            if (currSum < 0) {
                currSum = 0;
            }
            if (maxSum < currSum) {
                maxSum = currSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = { -2, -4, 4, -1, -2, 1, 5, -3 };
        int maxSum = kadansAlgo(numbers);

        System.out.println("The max of sub-arrays : " + maxSum);
    }
}
