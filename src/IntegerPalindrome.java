import java.util.ArrayList;
import java.util.List;

public class IntegerPalindrome {
    /*
    * This is generally asked as follow-up or alternative of the previous program.
    *  This time you need to check if given Integer is palindrome or not.
    * An integer is called palindrome if it's equal to its reverse, e.g. 1001 is a palindrome,
    * but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234.

*/
    public static void main(String[] args) {
        System.out.println(isNumberPalindrome(27122));
        System.out.println(isNumberPalindrome(123321));
        System.out.println(isNumberPalindrome(12321));
    }
    private static boolean isNumberPalindrome(int a){

       String s = String.valueOf(a);
       int start =0;
       int end = s.length()-1;
       while(start<end){
           if(s.charAt(start)!=s.charAt(end)) return false;
           end--;
           start++;
       }
       return true;
      /*   commented part is another way to solve the puzzle without making it a string.
      List<Integer> arr = new ArrayList<>();
      int digit;
       if (a<10) return true;
       while(a>0){
           digit = a%10;
           a= a /10;
           arr.add(digit);
       }
       int limit = arr.size()/2;
       int j = arr.size() -1;
      for(int i=0;i<limit;i++){
          if(arr.get(i)!=arr.get(j)){
              return false;
          }
          j--;
      }
        return true;
        */

    }


}

