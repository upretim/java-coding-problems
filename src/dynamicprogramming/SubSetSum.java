package dynamicprogramming;

public class SubSetSum {
    public static void main(String[] args) {
        int [] arr = {1,2,4,7,9};
       System.out.println(isThere(arr,arr.length,50));
       System.out.println(isThere(arr,arr.length,24));
       System.out.println(isThere(arr,arr.length,23));
       System.out.println(isThere(arr,arr.length,10));
       System.out.println(isThere(arr,arr.length,11));
        System.out.println("====================================");
        System.out.println(isThereII(arr,arr.length,50));
        System.out.println(isThereII(arr,arr.length,24));
        System.out.println(isThereII(arr,arr.length,23));
        System.out.println(isThereII(arr,arr.length,10));
        System.out.println(isThereII(arr,arr.length,11));
    }
    /*Given a set of non-negative integers, and a value sum, determine if there is
     a subset of the given set with sum equal to given sum. */

    public static boolean isThere(int []arr, int index,int target){
        if(target==0) return true;
        if(index==0) return false;
        if(arr[index-1]>target) return isThere(arr,index-1,target);
        else return (isThere(arr, index-1,target-arr[index-1])) || (isThere(arr,index-1,target));
    }
    //isThereII not working as it should
    public static boolean isThereII(int []arr, int index,int target){
        if(target==0) return true;
        if(index==0) return false;
        if(target>arr[index-1]){
            if((isThereII(arr, index-1,target-arr[index-1])==true) || (isThereII(arr,index-1,target))==true) return true;
        }
        else  {
            if(isThereII(arr,index-1,target)==true) return true;
        }
        return false;
    }

}
