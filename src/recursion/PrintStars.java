package recursion;

public class PrintStars {
    public static void main(String[] args) {
        System.out.println("===============printStar===============");
        printStar(5);
        System.out.println("\n");
        System.out.println("===============printTriangle===============");
        printTriangle(5);
    }

    private static void printStar(int num){
        if(num==0) return;
        printStar(num-1);
        System.out.print("*");
    }
    private static void printTriangle(int num){
        if(num==0) return;
        printTriangle(num-1);
        System.out.println("*".repeat(num));
    }
}
