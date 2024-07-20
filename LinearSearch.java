import java.util.Scanner;
public class LinearSearch {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int [] arr = new int[]{2,4,6,8,10,12,14,16,18,20};
        System.out.print("Enter which element to find: ");
        int num = input.nextInt();
        boolean found = false;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == num){
                System.out.print("Number found at index: "+ i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.print("Number "+ num + " does not exist in the array");
        }
    }

}
