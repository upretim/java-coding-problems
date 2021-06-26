import java.util.LinkedList;
import java.util.List;
//https://leetcode.com/problems/word-search-ii/
public class WordSearchII {

    public List<String> findWords(char[][] board, String[] words) {
        List<String> ans = new LinkedList<>();
        for(String str: words){
            boolean found = false;
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(str.charAt(0)==board[i][j] && exists(board,str,i,j,0)){
                        ans.add(str);
                        found = true;
                        break;
                    }
                }
                if (found) break;
            }
        }

        return  ans;
    }

    public boolean exists(char[][] board, String word, int i, int j, int counter){
        if(counter==word.length()) return true;
        if(i<0||j<0 || i>=board.length|| j>=board[0].length || word.charAt(counter)!=board[i][j]) return false;
        char ch = board[i][j];
        board[i][j] = ' ';
        boolean found = exists(board,word, i+1, j, counter+1) ||
                        exists(board,word, i-1, j, counter+1) ||
                        exists(board,word, i, j-1, counter+1) ||
                        exists(board,word, i, j+1, counter+1);
        board[i][j] = ch;

        return found;
    }
}
