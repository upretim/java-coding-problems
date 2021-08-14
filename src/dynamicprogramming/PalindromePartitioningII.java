package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioningII {
    public static void main(String[] args) {
     String s = "ababababababababababababcbabababababababababababa";
     System.out.println(minCut(s));
    }
    public static int minCut(String s) {
        List<List<String>> result = new ArrayList();
        return getPalindromePartition(s);
    }
    private  static int getPalindromePartition(String s){
        System.out.println("s : " + s);
        if(s.isEmpty()) return 0;
        Integer min = null;
        for(int i=1;i<=s.length();i++){
            String left = s.substring(0,i);
            String right = s.substring(i);
            if(isPalindrome(left)){
                 int val =getPalindromePartition(right)+1;
                System.out.println("val : " + val);
                 if(min==null || min>val) min = val;
            }
        }
        return  min;
    }
    private static boolean isPalindrome(String s){
        if(s.length()==1) return  true;
        int start =0, end = s.length()-1;
        while (start<end){
            if(s.charAt(start)!=s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
