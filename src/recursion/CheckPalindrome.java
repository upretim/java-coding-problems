package recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        String str = "namman";
        System.out.println(isPalindrome(str, 0, str.length()-1));
    }
    /*this function checks if a string is palindrome or not*/
    private static boolean isPalindrome(String str, int start, int end){
        if(end<=start) return true;
        if(str.charAt(start)==str.charAt(end)) return (isPalindrome(str, start+1, end-1));
        return false;
    }
}
