import java.util.Scanner;
public class Vote {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println(agecheck(age));
    }

    static String agecheck(int age){
        if (age>=18){
            return "You are eligible to vote";
        }
        else
            return "You are not eligible to vote";
    }
}
