package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class NQueen {
    private static List<List<String>> answer;
    public static void main(String[] args) {
        int n=4;
        boolean[][] board =  new boolean[n][n];
        int [][]  ans = new int [n][2];
        answer = new ArrayList<>();
        NQueenSolution(board,0,0,n,0,ans);
        for(List<String> ans1: answer){
            System.out.println(ans1);
        }
    }

    private static void NQueenSolution (boolean[] [] board, int row, int col, int totalQueens, int queensPlacedSoFar, int [][] ans){

        if(totalQueens==queensPlacedSoFar){
            String [][] sol =  new String[board.length][board.length];
            for(int i=0;i<sol.length;i++){
                for(int j=0;j<sol.length;j++){
                    sol[i][j] = ".";
                }
            }
            for(int i=0;i<ans.length;i++){
                sol[ans[i][0]][ans[i][1]] = "Q";
            }
            display(sol);
            return;
        }

        if(col==board.length){
            col=0;
            row++;
        }
        if(row==board.length) return;

        if(isSafePosition(board, row, col)){
            board[row][col]= true;
            ans[row] = new int[]{row, col};
            NQueenSolution(board,row+1,0,totalQueens, queensPlacedSoFar+1,ans);
            board[row][col]= false;
        }/// this is for backtracking
        NQueenSolution(board,row,col+1,totalQueens, queensPlacedSoFar,ans);
    }

    private static void display(String[][] sol) {
        List<String>  lst = new ArrayList<>();
        for(int i=0;i<sol.length;i++){
            String str = "";
            for(int j=0;j<sol.length;j++){
                str = str + sol[i][j];
            }
            lst.add(str);
        }
        answer.add(lst);
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
