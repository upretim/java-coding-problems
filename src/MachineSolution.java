public class MachineSolution {
    public static void main(String[] args) {

    }
    static long minTime(long[] machines, long goal) {
        int numberOfMachines = machines.length;
        int days = 1, productionAfterDayNumber =0;
        while(true){
            productionAfterDayNumber = 0;
            for(int i=0;i<numberOfMachines;i++){
                productionAfterDayNumber = (int) (days / machines[i]) + productionAfterDayNumber;
            }
            if(productionAfterDayNumber==goal)
                return days;
            days++;

        }
    }
}
