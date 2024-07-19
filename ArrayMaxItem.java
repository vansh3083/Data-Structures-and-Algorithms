import java.util.Scanner;
import java.util.Arrays;
public class ArrayMaxItem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("Array:");
        System.out.println(Arrays.toString(arr));

        System.out.println("Max Element is: "+ max(arr));
    }

    static int max(int[] arr){
        int max =  arr[0];
        for (int i = 0; i < arr.length; i++){
          if(arr[i] > max){
              max = arr[i];
          }
        }
        return max;
    }
}