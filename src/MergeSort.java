import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={12,4,5,23,78,2};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void mergeSort(int[] arr,int left ,int right){
        if(left>=right) return ;
        int mid=left+(right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        simpleMerge(arr,left,mid,right);
    }
    static void simpleMerge(int [] arr, int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;

        int[] leftarr=new int[n1];
        int[] rightarr=new int[n2];

        for (int i = 0; i < n1; i++) {
            leftarr[i]=arr[left+i];
        }
        for (int i = 0; i < n2; i++) {
            rightarr[i]=arr[mid+1+i];
        }
        int i=0,j=0,k=left;
        while(i<n1 && j<n2){
            if(leftarr[i]<rightarr[j]){
                arr[k++]=leftarr[i++];
            }
            else {
                arr[k++]=rightarr[j++];
            }
        }
        while(i<n1){
            arr[k++]=leftarr[i++];
        }
        while(j<n2){
            arr[k++]=rightarr[j++];
        }

    }
}
