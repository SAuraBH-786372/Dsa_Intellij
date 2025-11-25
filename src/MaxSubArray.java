import java.util.ArrayList;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Max Sum: " + maxSubArray(arr));
    }
    static int maxSubArray(int[] arr) {
        int curr = arr[0];
        int max = arr[0];
        int start = 0, end = 0, tempStart = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > curr + arr[i]) {
                curr = arr[i];
                tempStart = i;
            } else {
                curr += arr[i];
            }
            if (curr > max) {
                max = curr;
                start = tempStart;
                end = i;
            }
        }
        System.out.print("Subarray: ");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return max;
    }
}
