public class CountFreq {
    static int[] newArr = new int[10];

    public static void main(String[] args) {
        int[] arr = {16, 17, 16, 3, 3, 2};
        for (int i = 0; i < arr.length; i++) {
            if (!Isexist(arr[i], newArr)) {
                int count = freq(arr, arr[i]);
                newArr[i] = arr[i];
                System.out.println(arr[i] + " -> " + count);
            }
        }
    }

    // count frequency of a given value using recursion
    static int freq(int[] arr, int target) {
        return freqHelper(arr, target, 0);
    }

    static int freqHelper(int[] arr, int target, int index) {
        if (index == arr.length) return 0;

        if (arr[index] == target)
            return 1 + freqHelper(arr, target, index + 1);

        return freqHelper(arr, target, index + 1);
    }


    static boolean Isexist(int val, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) return true;
        }
        return false;
    }
}
