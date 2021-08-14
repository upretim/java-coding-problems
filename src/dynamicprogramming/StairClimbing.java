package dynamicprogramming;

import java.util.HashMap;

public class StairClimbing {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        System.out.println(StairClimbingTopDown(8,map));
        System.out.println(StairClimbingBottomUp(8));
    }
    private static int StairClimbingTopDown(int n, HashMap<Integer,Integer> map){
        if(map.containsKey(n)) return map.get(n);
        if(n==1) return 1;
        if(n==2) return 2;
        int result= StairClimbingTopDown(n-1, map) + StairClimbingTopDown(n-2,map);
        map.put(n,result);
        return result;
    }

    private static int StairClimbingBottomUp(int n){
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<dp.length;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}

