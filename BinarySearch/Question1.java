package BinarySearch;

public class Question1 {
    public static void main(String[] args) {
         int[] arr={2,3,5,9,14,16,18};
         int target=15;
         int ans = ceilling(arr , target);
         System.out.println(ans);
    }
    // return the index of smalled no >= target
    static int ceilling(int[]arr , int target){
        //but what if the target is greater then the greater then the greatest number in the arry
        if (target> arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end =arr.length-1;

        while(start<=end){
            //find the middle element
            //int end = (start+ end)/2;//might
            int mid = start + (end - start)/2;

            if(target<arr[mid]){
                end = mid -1;
            } else if (target > arr[mid]) {
                start=mid+1;
            }
            else {
                return mid;
            }

        }
        return start ;
    }
}
