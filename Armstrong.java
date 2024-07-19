import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num =  input.nextLong();
        long count=0;
        double arm=0;
        long copy = num;
        while(copy>0){
            copy /= 10;
            count++;
        }
        copy = num;
        while(num>0) {
            long temp = num % 10;
            num /= 10;
            arm = arm + Math.pow(temp, count);
        }
        if(arm == copy){
            System.out.println("Armstrong number");
    }
        else{
            System.out.println("Not Armstrong number");
        }

    }
}
