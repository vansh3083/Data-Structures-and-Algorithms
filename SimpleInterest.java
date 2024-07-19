import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double p = input.nextDouble();

        System.out.print("Enter the interest rate: ");
        double r = input.nextDouble();

        System.out.print("Enter the time: ");
        long t = input.nextLong();


        double interest = (p * r * t)/ 100;

        System.out.println("Your interest is: " + interest);

    }
}
