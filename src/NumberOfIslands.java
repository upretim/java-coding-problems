import java.util.HashSet;
import java.util.Set;

public class NumberOfIslands {
    public static void main(String[] args) {
       Set<String> set = new HashSet<String>();
    }
    /*problem statement
    https://leetcode.com/problems/number-of-islands/
    * */
    private static int numIslands(char[][] grid, Set<String> set){
        int width =grid.length;
        int height = grid[0].length;
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                if(grid[i][j]=='1'){
                    int[][] cells = new int[][]{{i,j}};
                    String key = i+"__"+j;
                    if(!set.contains(key)){
                        markConnectedCells(grid, cells, set);
                    }
                }
            }
        }

        return 0;
    }
    private static void markConnectedCells(char[][] grid, int[][] cells, Set<String> set){
        //Queue<Integer> queue =
    }
}
