package dynamicprogramming;

import java.util.Arrays;

public class NonOverlappingBridges {
    /*north and south bank of a  bridge is given in form of array, and an array of bridges
    is provided as input, we are suppose to  find out max number of non overlapping bridges
    bridge north end south end as [3,7] and array of bridges as
    [[6,4],[4,3],[2,6],[1,5]]*/

    public static class Bridge implements Comparable<Bridge> {
        int north;
        int south;

        public Bridge(int north, int south) {
            this.north = north;
            this.south = south;
        }

        @Override
        public int compareTo(Bridge o) {
            return this.north - o.north;
        }

        @Override
        public String toString() {
            return "Bridge{" +
                    "north=" + north +
                    ", south=" + south +
                    '}';
        }
    }

    public static void main(String[] args) {
        Bridge[] bridges = {new Bridge(6, 1),
                new Bridge(4, 3),
                new Bridge(2, 6),
                new Bridge(1, 5)
        };
        System.out.println(getMax(bridges));
    }

    private static int getMax(Bridge[] bridges) {
        Arrays.sort(bridges);
        int dp[] = new int[bridges.length];

        int max = 0;
        for (int i = 0; i < bridges.length; i++) {
            int currentMax = 0;
            for (int j = 0; j < i; j++) {
                if (bridges[j].south <= bridges[i].south) {
                    if (dp[j] > currentMax) {
                        currentMax = dp[j];
                    }
                }
            }
            dp[i] = currentMax + 1;
            if (max < dp[i]) max = dp[i];
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
