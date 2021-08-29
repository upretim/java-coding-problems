package dynamicprogramming;

public class NQueenII {
    private static int totalSolutions = 0;
    public static void main(String[] args) {
        int n=4;
        boolean[][] board =  new boolean[n][n];
        String ans = "";
        totalSolutions=0;
        NQueen(board,0,0,n,0,ans);
        System.out.println("total Solutions are " + totalSolutions);
    }

    private static void NQueen(boolean[] [] board, int row, int col, int totalQueens, int queensPlacedSoFar, String ans){

        if(totalQueens==queensPlacedSoFar){
            System.out.println("answer is " + ans);
            totalSolutions++;
            return;
        }

        if(col==board.length){
            col=0;
            row++;
        }
        if(row==board.length) return;

        if(isSafePosition(board, row, col)){
            board[row][col]= true;
            NQueen(board,row+1,0,totalQueens, queensPlacedSoFar+1,ans+ " [ "+row+" - " + col +"]");
            board[row][col]= false;
        }
        NQueen(board,row,col+1,totalQueens, queensPlacedSoFar,ans);
    }

    private static boolean isSafePosition(boolean[][] board, int row, int col) {
       /* vertically up */
        int r = row-1;
        int c= col;
        while(r>=0){
           if (board[r][c]) return false;
           r--;
        }
        // diagonally left
        r = row-1;
        c= col-1;
        while(r>=0 &&  c>=0){
            if (board[r][c]) return false;
            c--;
            r--;
        }
       // diagonally right
        r = row-1;
        c= col+1;
        while(r>=0 &&  c<board.length){
            if (board[r][c]) return false;
            c++;
            r--;
        }

        return true;
    }
}
