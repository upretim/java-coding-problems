package dynamicprogramming;

public class SubsetSumCount {
    public static void main(String[] args) {
      int[] arr =new int[]{1, 2, 3, 3};
      System.out.println(subsetCount(arr,6,3));
    }
    /*Given an array arr[] of length N and an integer X, the task is to
    find the number of subsets with sum equal to X*/
    private static int subsetCount(int[] arr, int sum, int index){
        if(sum==0) return 1;
        if(sum<0) return 0;
        if(index<=-1) return 0;
        int count =0;
        if(sum<arr[index]){
            count = count + subsetCount(arr,sum,index-1);
        }
        else{
            count = count + subsetCount(arr,sum-arr[index],index-1);
            count = count + subsetCount(arr,sum,index-1);
        }
        return count;
    }
}
