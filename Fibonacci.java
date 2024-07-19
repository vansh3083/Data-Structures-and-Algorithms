import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("Enter the number: ");
         int n = input.nextInt();
         long firstTerm = 0;
         long secondTerm = 1;
         for(int i = 1 ; i<=n; i++){
             long nextTerm = firstTerm + secondTerm;
             System.out.print(firstTerm + " ");
             firstTerm = secondTerm;
             secondTerm = nextTerm;
         }
    }
}