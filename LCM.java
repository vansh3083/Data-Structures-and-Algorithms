import java.util.*;
public class LCM {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        int max = Math.max(num1, num2);

        if(num1 == 0 || num2 == 0 ){
            System.out.print("LCM of "+num1+" and "+num2+   " is 0");
        }
        else{
            for(int i = max; i > 0; i++){
                if( i % num1 == 0 && i % num2 == 0){
                    System.out.print("LCM of "+num1+" and "+num2+   " is "+i);
                    break;
                }
            }
        }




    }
}
