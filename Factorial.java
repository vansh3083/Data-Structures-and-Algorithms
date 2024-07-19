import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
       int ans = factorial();
        System.out.println(ans);
    }
    static int factorial(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int fact=1;
        for(int i=1; i<=num; i++){
            fact = i * fact;
        }
        return fact;
    }
}
