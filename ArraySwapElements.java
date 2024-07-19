import java.util.Scanner;
import java.util.Arrays;
public class ArraySwapElements {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.print("Enter the elements of the array: ");
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Array before Swapping:");
        System.out.println(Arrays.toString(arr));

        swap(arr, arr[2], arr[4]);
        System.out.print("Array after Swapping:");
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2){
        int temp =  arr[2];
        arr[2] = arr[4];
        arr [4] = temp;
    }
}
