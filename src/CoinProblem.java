import java.util.ArrayList;

public class CoinProblem {
    public static void main(String[] args) {
        System.out.println(canSum(new int[]{4,2},7));
        System.out.println(canSum(new int[]{4,3},7));
        System.out.println(canSum(new int[]{14,7},300));
        System.out.println(hasSum(new int[]{14,7},300));
        System.out.println(hasSum(new int[]{4,3},7));
        System.out.println(hasSum(new int[]{7,4,3},7));
        System.out.println(bestSum(new int[]{5,3,4,7},7));
        System.out.println(bestSum(new int[]{2,3,5},8));
        System.out.println(bestSum(new int[]{7,26},100));
    }
    /**
     * this a function that takes a target sum and an array of numbers as arguments, and
     * return boolean indicating if it is possible to generate the target sum using numbers of array
     * we can use a number multiple time and array contains non negative numbers only.
     * console.log(canSum(7,[4,2]));
     * console.log(canSum(7,[4,3]));
     * console.log(canSum(300,[7,14]));
     */
    private static boolean canSum(int[] array, int amount){
        if(amount ==0) return true;
        if(amount<0) return false;

        for(int num:array ){
            int leftAmount = amount-num;
            if(canSum(array, leftAmount)){
                return true;
            }
        }
        return false;
    }
    /**
     * this function takes a number (target) and an array of numbers as arguments and
     * return any combination of numbers from array that adds up to target(first argument), if target sum cannot be formed
     * it returns null; array is having only non negative numbers
     * If there are multiple combinations it can return any one such combination, a number can be used multiple times
     */
    private static ArrayList<Integer> hasSum(int[] array, int amount){
        if(amount ==0) return new ArrayList<>();
        if(amount<0) return null;

        for(int num:array ){
            int leftAmount = amount-num;
             ArrayList<Integer> result = hasSum(array, leftAmount);
              if(result!=null){
                result.add(num);
                return result;
             }
        }
        return null;
    }
    /*Write a function best sum  bestSum(targetSum, array), it takes a target sum and an array of
     positive numbers, the function returns the smallest length combination of numbers that adds
     up to target sum.
    */
    private static ArrayList<Integer> bestSum(int[] array, int amount){
        if(amount ==0) return new ArrayList<>();
        if(amount<0) return null;
        ArrayList<Integer> bestSumList = null;
        for(int num:array ){
            int leftAmount = amount-num;
            ArrayList<Integer> result = bestSum(array, leftAmount);
            if(result!=null){
                result.add(num);
                if(bestSumList==null || result.size()<bestSumList.size()){
                    bestSumList = result;
                }
            }
        }
        return bestSumList;
    }

}
