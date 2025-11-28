import java.util.Arrays;

public class RotateByK {
    public static void main(String[] args) {
        int[] arr={12,34,2,3,1,20,31,4};
        System.out.println(Arrays.toString(rotation(arr,3)));

    }
    static int[] rotation(int[] arr, int k){
        int[] res=newArr(arr,k,arr.length-1);
        int j=0;
        for (int i = arr.length-k; i < arr.length; i++) {
            res[i]=arr[j++];
        }
        return res;
    }
    static int[] newArr(int[] oldArr,int start,int end){
        int [] newArr=new int[oldArr.length];
        int j=0;
        for (int i = start; i <=end; i++) {
            newArr[j++]=oldArr[i];
        }
        return newArr;
    }

}
