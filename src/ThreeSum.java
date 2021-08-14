import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

    }
    public List<List<Integer>> threeSum(int[] nums) {
       Arrays.sort(nums);
       List<List<Integer>> result = new ArrayList<>();

       for(int i=0;i<nums.length;i++){
           if(i==0 || nums[i] != nums[i-1]){
               int needed = (nums[i])*(-1);
               int low = i+1;
               int high = nums.length-1;
               while(low<high){
                   if(nums[low]+nums[high]==needed){
                       result.add(Arrays.asList(nums[i], nums[low],nums[high])) ;
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
       return result;
    }

    public List<List<Integer>> threeSumII(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new LinkedList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                int lo = i+1;
                int hi = nums.length-1;
                int sum = nums[i]*(-1);

                while(lo<hi){
                    if(nums[lo]+nums[hi]==sum){
                        res.add(Arrays.asList(nums[i],nums[lo], nums[hi]));
                        while (lo<hi && nums[lo]==nums[lo+1]) lo++;
                        while (lo<hi && nums[hi]==nums[hi-1]) hi--;
                        lo++;
                        hi--;
                    }
                    else if(nums[lo]+nums[hi]>sum) hi--;
                    else lo++;
                }
            }

        }

        return res;
    }
}
