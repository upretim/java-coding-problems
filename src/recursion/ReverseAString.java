package recursion;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverseString("abc"));
    }
    private static String reverseString(String str){
        if(str.length()==0) return "";
        return reverseString(str.substring(1));
    }
}
