import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        /*A String is balanced String if every opening bracket ( "({[" ) of the string is closed properly in sequence
        example of balanced string (({[]})), (){}[]
        example of unbalanced strings ({[)]} closing sequence is not proper*/
        System.out.println(isBalancedString("[]"));

    }
    private static boolean isBalancedString(String str){
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<str.length();i++){
            System.out.println("i is "+ i);
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='[' )
                stack.push(str.charAt(i));
            else if((str.charAt(i)== ')') && stack.peek() =='('){
                stack.pop();
            }
            else if((str.charAt(i)== '}') && stack.peek() =='{'){
                stack.pop();
            }
            else if((str.charAt(i)== ']') && stack.peek() =='['){
                stack.pop();
            }
        }
       return stack.isEmpty();
    }
}
