public class LongestIncreasingPath {
    public static void main(String[] args) {

    }
    //https://leetcode.com/problems/longest-increasing-path-in-a-matrix/
    public int longestIncreasingPath(int[][] matrix) {
        int max =1;
        int[][] map = new int[matrix.length][matrix[0].length];
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int val = getLongestPath(matrix, i, j, -1, visited, map);
                if(val>max) max = val;
            }
        }
     return max;
    }

    public int getLongestPath(int[][] matrix, int i, int j, int value, boolean[][] visited, int[][] map){
        if(i<0 || j<0 || i==matrix.length || j== matrix[0].length || matrix[i][j]<=value) return 0;
        if (visited[i][j]) return 0;
        if(map[i][j]!=0) return  map[i][j];
        visited[i][j] = true;
        int l1 = 1+ getLongestPath(matrix, i+1, j, matrix[i][j], visited, map);
        int l2 = 1+ getLongestPath(matrix, i-1, j, matrix[i][j], visited, map);
        int l3 = 1+ getLongestPath(matrix, i, j-1, matrix[i][j], visited, map);
        int l4 = 1+ getLongestPath(matrix, i, j+1, matrix[i][j], visited, map);
        visited[i][j] = false;
        int result =  Math.max(Math.max(l1,l2), Math.max(l3,l4));
        map[i][j] = result;
        return  result;
    }
}
