import java.util.Scanner;
public class Largestnumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 =  input.nextDouble();
        System.out.print("Enter second number: ");
        double n2 = input.nextDouble();

        if(n1 > n2){
            System.out.println(n1 + " is greater than " + n2);
        }
        else{
            System.out.println(n2 + " is greater than " + n1);
        }

    }
}
