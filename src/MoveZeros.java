import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {12, 0, 1, 4, 5, 0};
        move(arr, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void move(int[] arr, int i, int pos) {
        if (i == arr.length) {
            fill(arr, pos);
            return;
        }

        if (arr[i] != 0) arr[pos++] = arr[i];

        move(arr, i + 1, pos);
    }

    static void fill(int[] arr, int pos) {
        if (pos == arr.length) return;
        arr[pos] = 0;
        fill(arr, pos + 1);
    }
}
