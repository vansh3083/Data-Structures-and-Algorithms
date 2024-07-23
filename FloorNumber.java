public class FloorNumber {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,14,16,18,20};
        int target = 5;
        System.out.println(floorNumber(arr, target));
    }
    static int floorNumber(int[] arr, int target){
        if(target < arr[0]){
            return -1;
        }
        int start =0;
        int end = arr.length-1;

        while (start<=end){
            int mid = (start + ((end - start)/2));
            if(target < arr[mid]){
                end = mid -1;
            }
            else if(target > arr[mid]){
                start = mid +1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];

    }
}
