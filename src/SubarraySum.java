import java.util.HashMap;

public class SubarraySum {
    // https://leetcode.com/problems/subarray-sum-equals-k/

    public static void main(String[] args) {

    }

    public static int getSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int ans = 0;
        int runningSum =0;
        for(int num: nums){
            runningSum = runningSum + num;
            if(map.containsKey(runningSum-k)) ans = ans + map.get(runningSum-k);
            if(map.containsKey(runningSum)) map.put(runningSum, map.get(runningSum) +1);
            else map.put(runningSum, 1);
        }
      return ans;
    }
}
