package dynamicprogramming;
import java.util.*;
import java.lang.String;
/*
Given weights and values of n items, put these items in a knapsack of capacity W to get the maximum
 total value in the knapsack. In other words, given two integer arrays val[0..n-1] and wt[0..n-1]
  which represent values and weights associated with n items respectively.
   Also given an integer W which represents knapsack capacity,
   find out the maximum value subset of val[] such that sum of the weights of this
   subset is smaller than or equal to W.
You cannot break an item, either pick the complete item or don’t pick it (0-1 property).
 weight of elements = {1, 2, 3}
 weight of values = {10, 15, 40}
 Capacity=6
 */
public class KnapsackZeroOne {
    public static void main(String[] args) {
        int weights[] = new int[]{12, 2, 1, 1, 4};
        int values[] = new int[]{4, 2, 1, 2, 10};
        int capacity = 15;
        int numberOfItems = values.length;
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        System.out.println(maxProfit(weights,values,capacity,numberOfItems,map));
    }
    private static int maxProfit(int[] w, int[] v, int capacity, int numberOfItems, HashMap<String, Integer> map){
        String Key = capacity+ "__"+ numberOfItems;
        if(map.containsKey(Key)) return map.get(Key);
       if(numberOfItems ==0 || capacity==0) return 0;
        if(w[numberOfItems-1]<=capacity){
            int ifItemIncluded = maxProfit(w,v, capacity-w[numberOfItems-1],numberOfItems-1,map) + v[numberOfItems-1];
            int ifItemExcluded = maxProfit(w,v, capacity,numberOfItems-1,map);
            return Math.max(ifItemIncluded,ifItemExcluded);
        }
        else {
            int ifItemExcluded = maxProfit(w,v, capacity,numberOfItems-1,map);
            return ifItemExcluded;
        }
    }
}
