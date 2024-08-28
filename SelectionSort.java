import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
        selection(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{1, 2, 3, 4, 5};
        selection(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{-32, 0, -78, 69, 500};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void selection(int[] arr){
        for(int i =0; i<arr.length; i++){
            // find the max item and swap with correct index
            int last = arr.length-i-1;
            int maxIndex =  getMaxIndex(arr, 0, last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    private static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = 0; i<=end; i++){
            if(arr[max] < arr[i]){
                max =i;
            }
        }
        return max;
    }
}
