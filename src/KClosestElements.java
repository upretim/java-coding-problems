import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KClosestElements {
    int start, end;
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,5};

        KClosestElements kClosestElements = new KClosestElements();
        kClosestElements.findClosestElements(arr,4,3);
       // kClosestElements.findClosestElements(arr,4,-1);
    }
    /*problem statement
    * https://leetcode.com/problems/find-k-closest-elements/
    *  */
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
       List<Integer> result= new ArrayList<>();
       int index = getIndex(arr,x);
       if(index!=-1){
           start = index+1;
           end = index-1;
           result.add(arr[index]);
           k--;
       }

       while(k>0){
           if(start<arr.length && end>=0){
               if(x-arr[end]<=arr[start]-x){
                   result.add(arr[end]);
                   end--;
               }
               else{
                   result.add(arr[start]);
                   start++;
               }
           }
           else if(start<arr.length){
               result.add(arr[start]);
               start++;
           }
           else if(end>=0){
               result.add(arr[end]);
               end--;
           }
           k--;
       }
        Collections.sort(result);
       for(int a: result){
           System.out.println(a);
       }
       return result;
    }
    private int getIndex(int[] arr, int x){
        int index=-1;
         start =0;
         end = arr.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(x==arr[mid]) return mid;
            else if(x>arr[mid]) start= mid+1;
            else if(x<arr[mid]) end= mid-1;
        }

        return  index;
    }
}
