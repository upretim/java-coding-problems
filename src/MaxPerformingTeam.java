public class MaxPerformingTeam {
    public static void main(String[] args) {
        MaxPerformingTeam maxPerformingTeam = new MaxPerformingTeam();
        int n =7;
        int [] speed = {1,4,1,9,4,4,4};
        int [] efficiency = {8,2,1,7,1,8,4};
        int k =6;
        System.out.println("result : " +  maxPerformingTeam.maxPerformance(n,speed,efficiency,k));
    }
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int maxPerformance =0;
        int loopEnd = (int)Math.pow(2,n);
        for(int i=1;i<loopEnd;i++){
            String str = Integer.toBinaryString(i);
            if(havingKEqualORLess(str,k)){
                int num = n-str.length();
                str = "0".repeat(num)+str;

                int minEfficiency =Integer.MAX_VALUE;
                int SumOfSpeed = 0;
                for(int j=0;j<str.length();j++){
                    if(str.charAt(j)=='1'){
                        SumOfSpeed = SumOfSpeed + speed[j];
                        if(minEfficiency>efficiency[j]) minEfficiency = efficiency[j];
                    }
                }
                int performance = SumOfSpeed* minEfficiency;
                if(performance>maxPerformance) maxPerformance = performance;
            }
        }
        return maxPerformance;
    }
    private boolean havingKEqualORLess(String str, int k){
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='1') k--;
       }
       if(k>=0) return true;
       return false;
    }
}
