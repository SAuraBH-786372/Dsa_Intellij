import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,4,4,5,6,6,7};
        System.out.println(Arrays.toString(twoSum(arr, 11)));
    }
    static int[] twoSum(int[] array,int target){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i]+array[j]==target){
                    return new int[]{array[i],array[j]};
                }
            }
        }
        return null;
    }
}
