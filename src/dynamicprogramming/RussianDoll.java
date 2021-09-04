package dynamicprogramming;

import java.util.Arrays;

//https://leetcode.com/problems/russian-doll-envelopes/
public class RussianDoll {
    public static  class Envelop implements  Comparable<Envelop>{
        int width;
        int height;
        public Envelop(int width, int height) {
            this.width = width;
            this.height = height;
        }

        @Override
        public int compareTo(Envelop o) {
            return this.width-o.width;
        }
    }

    public static void main(String[] args) {
        Envelop[] envelops = new Envelop[]{
                new Envelop(5,4),
                new Envelop(6,4),
                new Envelop(6,7),
                new Envelop(2,3)
        };
        maxCount(envelops);
    }

    private static int maxCount(Envelop[] envelops){
        Arrays.sort(envelops);
        int [] dp = new int[envelops.length];
        int max =0;
        for(int i=0;i<envelops.length;i++){
            int currentCount =0;
            for(int j=0;j<i;j++){
                if(envelops[j].height<envelops[i].height && envelops[j].width <envelops[i].width){
                    if(currentCount<dp[j]){
                        currentCount = dp[j];
                    }
                }
            }
            dp[i]=currentCount+1;
            if(dp[i]>max) max =dp[i];
        }
        String str ="";
        for (int i : dp) {
            str += i+ " ";
        }
        System.out.println(str);
        System.out.println(max);
        return max;
    }
}
