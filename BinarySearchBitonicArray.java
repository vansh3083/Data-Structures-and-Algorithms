public class BinarySearchBitonicArray {
    public static void main(String[] args){

        int[] arr = {0,1,6,8,13,7,5,2};
        System.out.println(peakIndexMountainArray(arr));
    }


    static int peakIndexMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                //descending part of an array, might be the answer
                //look at left, so end != mid -1
                end = mid;
            }
            else{
                //ascending part of an array
                start = mid+1;
            }
        }
        // in the end start == end and will point to the largest number
        // start and end are finding the maximum element in the above checks so whenever they're equal
        // that's the maximum value

        return start;
    }
}
