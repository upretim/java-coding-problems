public class SaveThePrisoner {
    public static void main(String[] args) {
        System.out.println(saveThePrisoner(5, 2, 1)); ///2
        System.out.println(saveThePrisoner(5, 2, 5));//3
    }
    private static int saveThePrisoner(int n, int m, int s) {
        int left = m%n;
        System.out.println("Left or odd "+left);
        System.out.println("S  "+s);
        System.out.println("m "+m);
        System.out.println("n  "+n);

        if ((s+left+1) >(n-m))
            return s+left-1;
      //  return n-(s+left+1)-n;

        return 0;

    }
}
