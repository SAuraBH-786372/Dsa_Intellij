import java.util.Arrays;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {12, 0, 1, 4, 5, 0};
        TwoSum(arr, 9);
    }

    static void TwoSum(int[] arr, int target) {
        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                System.out.println("The Pair is: " + arr[i] + " and " + arr[j]);
                return;
            }
            else if (sum < target) {
                i++;
            }
            else {
                j--;
            }
        }

        System.out.println("No pair found");
    }
}
