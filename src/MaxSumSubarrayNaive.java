import java.util.Arrays;

public class MaxSumSubarrayNaive {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int[] maxSubarray = maxSumSubarray(arr, k);
        System.out.println("Maximum sum subarray of size " + k + " = " + Arrays.toString(maxSubarray));
    }

    static int[] maxSumSubarray(int[] arr, int k) {
        int n = arr.length;
        if (n < k) return new int[0]; // edge case

        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;

        // Check all subarrays of size k
        for (int i = 0; i <= n - k; i++) { // start index
            int sum = 0;
            for (int j = i; j < i + k; j++) { // sum k elements
                sum += arr[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                startIndex = i; // store start of subarray
            }
        }

        // Build result subarray
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[startIndex + i];
        }

        return result;
    }
}
