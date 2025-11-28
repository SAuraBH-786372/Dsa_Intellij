public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={16,17, 4, 3, 5,2};
        System.out.println(secondLargest(arr));
    }
    static int secondLargest(int[] arr){
        int secondLargest = Integer.MIN_VALUE;
        int largest=largest(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
    static int largest(int[] arr){
        int largeNum=arr[0];
        int i=0;
        while(i<arr.length){
            if(arr[i]>largeNum){
                largeNum=arr[i];
                i++;
            }
            else{
                i++;
            }
        }
        return largeNum;
    }
}
