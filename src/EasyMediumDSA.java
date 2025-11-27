import java.util.Arrays;

public class EasyMediumDSA {
    public static void main(String[] args) {
        int[] arr={1,3,5,6,7,23,29};
        //System.out.println(Arrays.toString(revArray(arr, 0, arr.length-1)));
        String str="saurabh";
        //System.out.println(isPalindrome(str,0,str.length()-1));
        countVC(str);
    }
    static boolean sortCheck(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    static int[] revArray(int[] arr,int start,int end){
        if(start>=end) return arr;
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        return revArray(arr,start+1,end-1);
    }
    static boolean isPalindrome(String str,int start,int end){
        if(start>=end) return true;
        if(str.charAt(start)!=str.charAt(end)) return false;
        return isPalindrome(str,start+1,end-1);
    }
    static void countVC(String str){
        int Vcount=0;
        int Ccount=0;
        for (int i = 0; i < str.length(); i++) {
            if(isVowel(str.charAt(i))){
                Vcount+=1;
            }
            else{
                Ccount+=1;
            }
        }
        System.out.println("Vowel Count:"+Vcount);
        System.out.println("Consonent Count:"+Ccount);


    }
    static boolean isVowel(char a){
        char[] vowel={'a','e','i','o','u','A','E','I','O','U'};
        for (int i = 0; i < vowel.length; i++) {
            if(a==vowel[i]){
                return true;
            }
        }
        return false;
    }

}
