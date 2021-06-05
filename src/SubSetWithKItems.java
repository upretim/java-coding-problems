import java.util.ArrayList;

public class SubSetWithKItems {

    public static void main(String[] args) {
        ArrayList<int[]> list = getArrays(3, new int[]{1,2,3,4,7,8});
    }
    /*this method returns array list of  arrays of k size from an array of n elements
    for this input method will return all arrays of 3 elements.
    * */
   private static ArrayList<int[]> getArrays(int k, int arr[]){
       ArrayList<int[]> list = new ArrayList<>();
       int loopEnd = (int) Math.pow(2,arr.length);
       for(int i=1;i<loopEnd;i++){
           String str = Integer.toBinaryString(i);
           if(str.length()<k) continue;
            if(getNumberOfOnes(str,k)){
                int[] set =new int[k];
                int counter =0;
                for(int ind =0;ind<str.length();ind++){
                    System.out.println(str);
                    if(str.charAt(ind)=='1'){
                         set[counter] = arr[ind];
                         counter++;
                    }
                }
                list.add(set);
            }
       }
       return list;
   }
   private static boolean getNumberOfOnes(String str, int k){
       for(int i=0;i<str.length();i++){
           if(str.charAt(i)=='1') k--;
       }
       if(k==0) return true;
       return  false;
   }
}
