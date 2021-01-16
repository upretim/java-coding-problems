package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String [] args){
        System.out.println("This is implementation of bubble sort in Java");
        int [] array={1,2,3,2,6,3,9,1,34,0,-1};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    private static int[] bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-(i+1);j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
