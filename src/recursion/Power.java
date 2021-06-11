package recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(2,6));
        System.out.println(power(2,4));
    }
    /*this function recursively calculates b raise to power of a (for positive a and b)*/
    public static int power(int a, int b){
        if(b==0) return a;
        return a*power(a, b-1);
    }
}
