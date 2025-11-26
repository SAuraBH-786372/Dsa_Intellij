import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={2,4,4,5,6,6,7};
        removeDuplicates(arr);
        System.out.println(hs);

    }
    static HashSet<Integer> hs=new HashSet<>();
    static void removeDuplicates(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }
    }

}
