import java.util.Scanner;
public class SumN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();

        System.out.println(sum(n));
    }

    static int sum(int n){
        return n*(n+1)/2;
    }
}
