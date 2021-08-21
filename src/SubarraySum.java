import java.util.HashMap;

public class SubarraySum {
    // https://leetcode.com/problems/subarray-sum-equals-k/

    public static void main(String[] args) {
    int [] arr = {5,0,0,0};
     int k =   3;
        checkSubarraySum(arr,k);
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
    //https://leetcode.com/problems/continuous-subarray-sum/
    public static boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<=1) return  false;
        int runningTotal =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(runningTotal, -1);
        for(int num=0;num<nums.length;num++){
            runningTotal = runningTotal+nums[num];
            int res = runningTotal%k;
            if(map.containsKey(res) && (num - map.get(res)>1)) return true;
            if(!map.containsKey(res)) map.put(res,num);
        }
        return  false;
    }
}
