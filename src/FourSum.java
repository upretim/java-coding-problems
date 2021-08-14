import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {

    }
    //https://leetcode.com/explore/challenge/card/july-leetcoding-challenge-2021/610/week-3-july-15th-july-21st/3816/
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
         for(int p=0;p<nums.length;p++){
             if(p==0 || nums[p]!=nums[p-1]){
                 for(int i=p+1;i<nums.length;i++){
                        if(nums[i]==nums[i-1] && i>p+1) continue;
                         int needed = target-nums[i]-nums[p];
                         int low = i+1;
                         int high = nums.length-1;
                         while(low<high){
                             if(nums[low]+nums[high]==needed){
                                 result.add(Arrays.asList(nums[p], nums[i], nums[low],nums[high])) ;
                                 while(low<high && nums[low]==nums[low+1]) low++;
                                 while (low<high && nums[high]==nums[high-1]) high--;
                                 low++;
                                 high--;
                             }
                             else if (nums[low]+nums[high]>needed) high--;
                             else low++;
                         }
                 }
             }
         }
        return  result;
    }
}
