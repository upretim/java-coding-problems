package dynamicprogramming;

public class RodCuttingProblem {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 5, 8, 9, 10, 17, 17, 20};
        int size = arr.length;
        System.out.println(profit(size,arr));
    }
    /* Problem statement -- unbounded Knapsack
     https://www.geeksforgeeks.org/cutting-a-rod-dp-13/
     */
    private static int profit(int lengthOfRod, int[] priceOfPieces){
        if(lengthOfRod==0) return 0;
        int maxProfit =0;
        for(int i=0;i<lengthOfRod;i++){
            int profit = priceOfPieces[i] + profit(lengthOfRod-i-1,priceOfPieces);
            if(profit>maxProfit) maxProfit = profit;
        }
        return maxProfit;
    }
    private static int rodCuttingBottomUp(int lengthOfRod, int[] priceOfPieces){
       int result =0;
       return result;
    }

}

