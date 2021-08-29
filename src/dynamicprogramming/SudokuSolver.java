package dynamicprogramming;

public class SudokuSolver {
    private static boolean sudukoSolved = false;
    public static void display(int[][] board){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
     int[][] arr = {{5,3,0,0,7,0,0,0,0},
             {6,0,0,1,9,5,0,0,0},
             {0,9,8,0,0,0,0,6,0},
             {8,0,0,0,6,0,0,0,3},
             {4,0,0,8,0,3,0,0,1},
             {7,0,0,0,2,0,0,0,6},
             {0,6,0,0,0,0,2,8,0},
             {0,0,0,4,1,9,0,0,5},
             {0,0,0,0,8,0,0,7,9}};
        solveSudoku(arr);
        display(arr);

    }
    public static void solveSudoku(int[][] board) {
        solveSudoku_Helper(board,0,0);
    }

    public static void solveSudoku_Helper(int[][] board, int i, int j) {
        if(i==9) {

            sudukoSolved = true;
            return;
        }
        int ni, nj;
        if(j==board[0].length-1){
            ni = i +1;
            nj = 0;
        }else{
            ni = i;
            nj = j+1;
        }
        if(board[i][j]!=0){
            solveSudoku_Helper(board, ni, nj);
        }else {
            for(int po =1; po<=9; po++){
                if(isValid(board,i,j, po)){
                    board[i][j] = po;
                    solveSudoku_Helper(board, ni, nj);
                   if(sudukoSolved == false) board[i][j] = 0;
                }
            }
        }
    }

    private static boolean isValid(int[][] board, int x, int y, int val) {
        for(int j=0;j<9;j++){
            if (board[x][j]==val) return  false;
        }
        for(int i=0;i<9;i++){
            if(board[i][y]==val) return  false;
        }
        int smi = (x/3)*3;
        int smj = (y/3)*3;

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[smi+i][smj+j] == val) return false;
            }
        }
        return  true;
    }
}
