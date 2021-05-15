public class BinarySearch {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5};
        System.out.println(binarySearch(arr,1));
        System.out.println(binarySearch(arr,2));
        System.out.println(binarySearch(arr,3));
        System.out.println(binarySearch(arr,4));
        System.out.println(binarySearch(arr,5));
        System.out.println(binarySearch(arr,6));
    }
    private static int binarySearch(int[] arr, int target){
        int index=-1;
        int start =0;
        int end = arr.length-1;
        while(start<=end){
              int mid = (start+end)/2;
              if(target==arr[mid]) return mid;
              else if(target>arr[mid]) start=mid+1;
              else if(target<arr[mid]) end=mid-1;
        }
      return index;
    }
}
