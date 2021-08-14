public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{1,2,3,4}};
        int[][] arr1 = {{1,2,3},{1,2,3}, {1,2,3}};
        int[][] arr2 = {{1,2},{3,4},{1,2},{3,4}};
        int[][] arr4 = {{0,0},{0,1}};

        transposeMatrix(arr);
    }
    /*this method accepts a 2D matrix and return the transposed matrix*/
    public static int[][] transposeMatrix(int[][] arr){
        int [][] transposedMatrix = new int [arr[0].length][arr.length];
        int width = arr.length;
        int height = arr[0].length;
        for(int i=0;i<height;i++){
            int [] col = new int[width];
            for(int j=0;j<width;j++){
                col[j] =arr[i][j];
            }
            transposedMatrix[i] = col;
           //System.out.print("\n");
        }
        return transposedMatrix;
    }
}
