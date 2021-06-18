package recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AllPermutations {

    public static void main(String[] args) {
        String str = "abb";
        List<String> list = new ArrayList<>();
        printAllPermutations(str,0);
        System.out.println("================");
        AllPermutations allPermutations = new AllPermutations();
        allPermutations.allUniquePermutations(str, 0);
    }
   /*this function prints all the permutations of a string*/
    private static void printAllPermutations(String str, int currentIndex){
      if(currentIndex==str.length()) {
          System.out.println(str);
          return;
      }
    for(int i=currentIndex;i<str.length();i++){
        str = swapsChars(str,currentIndex,i);
        printAllPermutations(str, currentIndex+1);
        str= swapsChars(str,currentIndex,i);
      }
    }
    /*this function prints all the unique permutations of a string*/
    private void allUniquePermutations(String str, int currentIndex){
        if(currentIndex==str.length()){
            System.out.println(str);
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for(int i=currentIndex;i<str.length();i++){
            if(set.contains(str.charAt(i))==true) continue;
            set.add(str.charAt(i));
            str = swapsChars(str, currentIndex,i);
            allUniquePermutations(str,currentIndex+1);
            str = swapsChars(str, currentIndex,i);
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
