package recursion;

import java.util.ArrayList;
import java.util.List;

public class AllPermutations {
    public static void main(String[] args) {
        String str = "abc";
        List<String> list = new ArrayList<>();
        printAllPermutations(str,0, str.length()-1);
    }

    private static void printAllPermutations(String str, int left, int right){
      if(left==right) {
          System.out.println(str);
          return;
      }
    for(int i=left;i<=right;i++){
        str = swapsChars(str,left,i);
        printAllPermutations(str, left+1, right);
        str= swapsChars(str,left,i);
      }
    }
    // logic to swap the characters
    private static String swapsChars(String str, int left, int right){
        char[] charArray = str.toCharArray();
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right]=temp;
        return String.valueOf(charArray);
    }
}
