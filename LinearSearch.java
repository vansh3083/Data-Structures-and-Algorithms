import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] arr = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.print("Enter which element to find: ");
        int num = input.nextInt();
        boolean found = false;
        System.out.println(linearSearch(arr, num));
    }

    static String linearSearch ( int[] arr, int num){

        if(arr.length==0){
            return "Array does not exists";
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return "Number found at index: " + i;
            }
        }

        return "Number does not exist in the array";
    }
}
