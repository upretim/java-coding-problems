import java.util.Arrays;

public class ThreeSumClosest {
    //https://leetcode.com/problems/3sum-closest/

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++){
            int low = i+1;
            int high = nums.length-1;
            while(low<high){
               int sum = nums[i] + nums[low] + nums[high];
               if(sum>target) high--;
               else low++;
               if(Math.abs(result-target)>Math.abs(sum-target)) result = sum;
            }
        }
        return result;
    }
}
