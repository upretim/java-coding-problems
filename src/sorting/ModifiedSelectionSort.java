package sorting;
/*
  this is slightly modified and efficient version of selection sort, in this version instead of lowest,
  code also tracks highest and makes swaps, hence reducing the inner loop count
  https://medium.com/afteracademy/100-data-structures-and-algorithms-problems-asked-during-coding-interviews-269391b8ff8
*/

import java.util.Arrays;

public class ModifiedSelectionSort {
      public static void main(String [] args) { //3,1,2
          int [] array ={4, 3, 1, 2};//3
          int [] array1 ={2, 3, 4, 1, 5};//3
          int [] array2 ={1, 3, 5, 2, 4, 6, 7};//3
          modifiedSelectionSort(array);
          System.out.println(Arrays.toString(array));
      };

    private static int[] modifiedSelectionSort(int[] arr){
        int h= arr.length-1;
        int i=0;
       while(i<h){
           int lowest = i;
           int highest =h;
           int j=i+1;
           int k=h-1;
           while(j<arr.length){
               if(arr[j]<arr[lowest]){
                   lowest = j;
               }
               if(arr[k]>arr[highest]){
                   highest = k;
               }
               k--;
               j++;
           }
           if(lowest!=i){
               int temp = arr[lowest];
               arr[lowest] = arr[i];
               arr[i]=temp;
           }
          /* if(highest!=k){
               int temp = arr[highest];
               arr[highest] = arr[h];
               arr[h]=temp;
           }*/
        //   if(highest==i && lowest==k)
           h--;
           i++;
       }
        return arr;
    }
}
