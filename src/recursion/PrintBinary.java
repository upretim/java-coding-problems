package recursion;

public class PrintBinary {
    public static void main(String[] args) {
        printBinary(43);
        System.out.println("\n");
        System.out.println(returnBinary(43,""));
        printBinary(2);
        System.out.println("\n");
        System.out.println(returnBinary(2,""));
        printBinary(12);
        System.out.println("\n");
        System.out.println(returnBinary(12,""));
    }
    /*this function prints binary of a decimal number*/
    private static void printBinary(int n){
        if(n<2) {
            System.out.print(n);
            return;
        }
        printBinary(n/2);
        System.out.print(n%2);
    }
    /*this function returns binary of a decimal number*/
    private static String returnBinary(int n, String str){
        if(n<2) return n+str;
        str= n%2+str;
        return returnBinary(n/2,str);
    }
}
