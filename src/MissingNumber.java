public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={2,3,4,5,6};
        System.out.println("The missing number is:"+missingNumber(arr));
    }
    static int missingNumber(int[] arr){
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1] + 1){
                return arr[i-1] + 1;
            }
        }

        return arr[arr.length - 1] + 1;
    }
}
