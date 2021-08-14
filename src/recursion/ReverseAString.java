package recursion;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverseString("abc"));
    }
    private static String reverseString(String str){
        if(str.length()==1) return str;
         return  reverseString(str.substring(1)) +str.substring(1);
       // return result + reverseString(str.substring(1));
    }
}
