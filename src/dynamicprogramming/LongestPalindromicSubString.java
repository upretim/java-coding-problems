package dynamicprogramming;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        longestPalindrome("hlllo");
    }
    private  static String longestPalindrome(String s){
        int len = s.length();
        String arr [][] = new String[len][len];
        String ans = "";
        for(int gap =0;gap<len;gap++){
            for(int i=0, j=gap;j<len;i++, j++){
                if(gap==0)  arr[i][j] = s.substring(i,j+1);
                 else {
                    var b = s.charAt(i) == s.charAt(j);
                    if(gap==1 && b) arr[i][j] = s.substring(i,j+1);
                    else if(gap>1 && b && arr[i+1][j-1]!=null) arr[i][j] = s.substring(i,j+1);
                }
                 if(arr[i][j]!=null && ans.length()<arr[i][j].length()) ans = arr[i][j];
            }
        }
        return ans;
    }

}
