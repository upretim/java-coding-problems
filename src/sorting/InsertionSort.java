package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] arr){
        int[] array={2,1,3,1,56,1,-9,4,5,23};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.Sort(array);
        System.out.println(Arrays.toString(array));
    }
    private int[] Sort(int [] arr){
        for(int i=1;i<arr.length;i++){
            int currentVal = arr[i];
            int j;
            for(j=i-1;j>=0 && arr[j]>currentVal; j--){
                 arr[j+1] = arr[j];
            }
            arr[j+1] = currentVal;
        }
      //  System.out.println(Arrays.toString(arr));
        return arr;
    }
}
