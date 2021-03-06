package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
        System.out.println("This is implementation of Selection Sort in Java");
        int [] array={1,2,3,2,6,3,9,1,34,0,-1};
        int [] array1 ={4, 3, 1, 2};//3
        selectionSort(array1);
        System.out.println(Arrays.toString(array1));
    }

    private static int[] selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++) {
            int least =i;
          for(int j=i+1;j<arr.length;j++){
              if(arr[j]<arr[least]){
                  least=j;
              }
          }
          if(least!=i){
              int temp= arr[i];
              arr[i]=arr[least];
              arr[least]=temp;
          }
        }
        return arr;
    }
}
