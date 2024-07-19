import java.util.Scanner;
import java.util.Arrays;
public class ArrayReverse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[6];
        for(int i=0; i< arr.length; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Array before reverse: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Array after reverse: ");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
        }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start < end){
            swap(arr, start, end);
            start++;
            end --;

        }
    }

    static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
