import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Anagram {
    /*
    This program checks minimum number of char to be deleted to make two Strings Anagram*/
    public static void main(String[] args) {
        deleteChar("Hello","Hello");
    }
    private  static int deleteChar(String a, String b){
        int returnValue =0;
        int len = a.length()>b.length()?a.length():b.length();
        Set<Character> set = new HashSet<>();
        for(int i=0;i<len;i++){
           if (a.length()>i) set.add(a.charAt(i));
           if (b.length()>i) set.add(b.charAt(i));
        }

        for(Character ch: set){
            int aCount=0, bCount =0;
            for(int k=0;k<len;k++){
                    if(a.length()>k && (a.charAt(k)) == ch)  aCount++;
                    if(b.length()>k && (b.charAt(k)) == ch)  bCount++;
            }
            returnValue = returnValue + Math.abs(aCount-bCount);

        }
        return returnValue;
    }
}
