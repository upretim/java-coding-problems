public class SquareRoot {
    public static void main(String[] args) {
        System.out.print(calculateSquareRoot(144));

    }
    private static int calculateSquareRoot(int a){
        int i=2;
        int b =a;
        int squareRoot = 1;
        while (a>i){
                if(a%(i*i)==0){
                    a= a/(i*i);
                    squareRoot = squareRoot*i;
                    i =2;
                }
                else
                 i++;

        }
        if(squareRoot*squareRoot ==b){
            return squareRoot;
        }
        else{
            System.out.print(b + " is not have any Integer square root hence :");
            return 0;
        }

    }
}

