package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {
    //https://www.youtube.com/watch?v=d9F1aO_idyE

    public static void main(String[] args) {
        String str = "hello";

        List<List<String>> result = new ArrayList();
        getPalindromePartition(str,new ArrayList<String>(), result);
      //  return result;
    }
    private  static void getPalindromePartition(String s, List<String> currentList, List<List<String>> result){
        if(s.isEmpty()) result.add(currentList);
        for(int i=1;i<=s.length();i++){
            String left = s.substring(0,i);
            String right = s.substring(i);
            if(isPalindrome(left)){
                List<String> list = new ArrayList<>(currentList);
                list.add(left);
                getPalindromePartition(right, list, result);
            }
        }
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
