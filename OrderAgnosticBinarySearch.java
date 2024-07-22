public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr2 = {87, 76, 69, 32, 29, 25, 22, 15, 11, 10};
        int target = 69;
        System.out.println(orderAgnosticBS(arr2, target));

        target = 99;
        System.out.println(orderAgnosticBS(arr2, target));

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        target = 10;
        System.out.println(orderAgnosticBS(arr, target));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end  = arr.length-1;
        boolean isAsc;
        isAsc = arr[start] < arr[end];

        while (start<=end){
            int mid = (start + ((end - start)/2));
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }
                else if(target > arr[mid]){
                    start = mid +1;
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid +1;
                                   }
                else if(target > arr[mid]){
                    end = mid -1;
                }
            }
        }
        return -1;
    }
}
