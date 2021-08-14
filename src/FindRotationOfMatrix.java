import java.util.Arrays;
import java.util.Collections;

public class FindRotationOfMatrix {
    public static void main(String[] args) {
        //[[0,0],[0,1]]
        //[[0,0],[1,0]]
      int[][] mat = new int[][]{{0,0},{0,1}};
      int[][] target = new int[][]{{0,0},{1,0}};
      FindRotationOfMatrix findRotationOfMatrix = new FindRotationOfMatrix();
       System.out.println(findRotationOfMatrix.findRotation(mat, target));
    }
  //https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/
    public boolean findRotation(int[][] mat, int[][] target) {

       return true;
    }
    public int[][] rotate90degree(int[][] mat){
        int[][] target = new int[][]{{0,0},{1,0}};
        Collections.reverse(Arrays.asList(mat));
        return target;
    }


}
