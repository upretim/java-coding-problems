package recursion;

import java.util.ArrayList;

public class AllSubStrings {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        allSubStrings("abc","",list);

    }
    /* this method prints all the substring of a String recursively */
    private  static void allSubStrings(String str, String output,ArrayList<String> list){
        if(str.length()==0) {
            System.out.println(output);
            return;
        }
        /*If char is not included in sub string */
        allSubStrings(str.substring(1),output, list);
        /*If char is included in sub string */
        allSubStrings(str.substring(1),output+str.charAt(0),list);
    }
    /* this method prints all the substring of a String recursively */
}
