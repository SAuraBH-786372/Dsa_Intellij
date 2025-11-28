import java.util.ArrayList;

public class Leader {
    public static void main(String[] args) {
        int[] arr={16,17, 4, 3, 5,2};
        leader(arr);
        System.out.println(ar);

    }
    static ArrayList<Integer> ar=new ArrayList<>();
    static void leader(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(isLeader(arr,i,i+1)){
                ar.add(arr[i]);
            }
        }
    }
    static boolean isLeader(int[] arr, int index, int start){
        if(start >= arr.length) return true; // no element to the right → leader
        if(arr[start] > arr[index]) return false; // found element greater → not leader
        return isLeader(arr, index, start + 1); // check next element
    }

}
