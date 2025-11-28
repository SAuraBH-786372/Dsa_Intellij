import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr={0,34,2,0,1,0,31,4};
        System.out.println(Arrays.toString(moveZeros(arr)));

    }
    static int[] moveZeros(int[] array){
        int[] newarr=new int[array.length];
        int j=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                newarr[j++] = array[i];
            }
        }
        return newarr;
    }
}
