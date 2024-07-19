import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        if(n==0){
            System.out.println("it is neither odd nor even");
        }
        else if(n%2==0){
            System.out.print("Even Number");
        }
        else
            System.out.print("Odd Number");
    }
}
