public class TrappingRainWater {
    //https://leetcode.com/problems/trapping-rain-water/
    public static void main(String[] args) {
       int [] arr = {4,2,0,3,2,5};
        trap(arr);
    }
    public static int trap(int[] height) {
        int result =0;
        int[] maxLeft = new int[height.length+1];
        int[] maxRight = new int[height.length+1];
        maxLeft[0]=0;
        maxRight[maxRight.length-1]=0;
        int leftMax =0;
        for(int i=0;i<height.length;i++){
            if(height[i]>leftMax) leftMax = height[i];
            maxLeft[i+1]=leftMax;
        }
        int rightMax =0;
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>rightMax) rightMax = height[i];
            maxRight[i] = rightMax;
        }
      for(int i=0;i<height.length;i++){
            int h = Math.min(maxLeft[i],maxRight[i+1])-height[i];
            if(h>0) result = result+ h;
      }
     return result;
    };
}
