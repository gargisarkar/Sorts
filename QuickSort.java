import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args){
        int[] arr = { 5, 9, 12, 17, 13, 6, 4, 8};
        int low = 0 ;
        int high = arr.length - 1;
        quick(arr, low, high);
       // Arrays.toString(arr);
    }

    public static void quick(int[] arr, int low, int high){
        if(low < high){
            int part = partition(arr, low, high);
            quick(arr,low, part -1);
            quick(arr,part+1, high);
        }

    }

    public static int partition(int[] arr,int low , int high){
        int j = low;
        int pivot = arr[high];
        int i = -1;
        for(j = low; j< high -1 ; j++){
            if(arr[j] > pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int x = pivot;
        arr[high] = arr[i+1];
        arr[i+1] = x;

        return i++;

    }

}
