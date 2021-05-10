package dynamicprogramming;

import java.util.HashMap;
import java.util.Map;

public class UniquePathsII {
    public static void main(String[] args) {
      int arr[][] = new int[][]{
                                {0,0,0},
                                {0,1,0},
                                {0,0,0}
                                };
      int width = arr.length-1;
      int height = arr[0].length-1;
      Map<String,Integer> map = new HashMap<>();
      System.out.println(UniquePaths(arr, width,height, map));
    }
    /* problem Statement:
    https://leetcode.com/problems/unique-paths-ii/
    * */
    private static int UniquePaths(int[][] grid, int width, int height, Map<String,Integer> map){
        String key = width+ "_"+height;
        if(map.containsKey(key)) return  map.get(key);
        if(grid[width][height]==1) return 0;
        if(width==0 && height==0) return 1;
        if(width<0 || height<0) return 0;
        int result1 =0;
        if(width>0 && height>=0) result1 =  UniquePaths(grid, width-1,height,map);
        int result2 = 0;
        if(height>0 && width>=0) result2 = UniquePaths(grid, width,height-1,map);
        map.put(key, result1+result1);
        return result1+result2;
    }
}
