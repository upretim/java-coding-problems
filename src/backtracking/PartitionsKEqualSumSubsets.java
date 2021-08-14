package backtracking;

import java.util.Arrays;

public class PartitionsKEqualSumSubsets {
   static boolean[] visited = new boolean[5];
    static int [] arr ={1,2,3,4,2};
   static int k=3;
    static int targetSum = Arrays.stream(arr).sum()/k;
    public static void main(String[] args) {

        PartitionsKEqualSumSubsets  partitionsKEqualSumSubsets = new PartitionsKEqualSumSubsets();
        System.out.println(partitionsKEqualSumSubsets.canPartitionKSubsets(0,k, 0, visited));
    }
    public boolean canPartitionKSubsets(int currentSum, int k, int index, boolean [] visited) {
        System.out.println("target sum: " + targetSum +"  currentSum: "+ currentSum + "  k: "+ k) ;
        if(k==0) return true;
        if(targetSum==currentSum) {
            return canPartitionKSubsets(0,  k-1, 0,visited);
        }

        for(int i=index;i<arr.length;i++){
            if((arr[i]+currentSum)<=targetSum && visited[i]==false){
                visited[i]=true;
                if(canPartitionKSubsets(currentSum+arr[i],k,i+1,visited)) {
                    return true;

                }
                visited[i]=false;
            }
        }
       // System.out.println("===here for false=====");
        return false;
    }
}
