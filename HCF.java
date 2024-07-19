import java.util.Scanner;
public class HCF {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = input.nextInt();

        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        for ( int i = max; i > 0 ; i--){
            if( num1 % i == 0 && num2 % i == 0){
                System.out.println("HCF of "+ num1 +" and "+num2 +" is "+i);
                break;
            }
        }


    }
}
