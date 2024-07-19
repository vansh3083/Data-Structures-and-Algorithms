import java.util.Scanner;
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println("Sum is: "+ans);
    }

    static int sum2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = input.nextInt();
        System.out.print("Enter the second number: ");
        int b = input.nextInt();
        int sum = a + b;
        return sum;
    }
}
