public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,4,5,6,7,23,34,56,7,890,911};
        System.out.println(binSearch(arr,890 ,0, arr.length -1));
    }
    static int binSearch(int[] arr,int target,int front,int rear){
        if(front> rear) return -1;
        int mid=front+(rear-front)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]) {
            return binSearch(arr, target, front, mid-1);
        }
        else {
            return binSearch(arr, target, mid + 1, rear);
        }

    }
}
