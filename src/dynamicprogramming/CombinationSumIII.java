package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    private static List<List<Integer>> list = null;
    //https://leetcode.com/problems/combination-sum-iii/
    public static void main(String[] args) {
       int k=3, n=7;
        combinationSum3(3,9);
        System.out.println("done");
    }
    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> oneList = new ArrayList<>();
        list = new ArrayList<>();
        combinationSum3Helper(k,  n, 0, 1, oneList);
        return list;
    }

    private static void combinationSum3Helper(int k, int n, int currentSum, int currentNumber, List<Integer> oneList) {
        if(k<0 || currentSum>n) return;
        if(currentSum==n && k==0){
            List<Integer> cloned_list = new ArrayList<Integer>(oneList);
            list.add(cloned_list);
            return;
        }
        for(int i=currentNumber;i<=9;i++){
            if(currentSum+i<=n ){
                oneList.add(i);
                combinationSum3Helper(k-1, n, currentSum+i, ++currentNumber, oneList);
                oneList.remove(oneList.size()-1);
            }
        }
    }
}
