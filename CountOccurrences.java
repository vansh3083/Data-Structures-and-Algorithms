import java.util.Scanner;

public class CountOccurrences {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = input.nextLong();
        int count=0;
        System.out.print("Enter the number to find the occurrences of ");
        int n = input.nextInt();

        while(num>0) {
           long temp = num % 10;
            if (temp == n) {
                count++;
            }
            num=num/10;
        }
        System.out.println("The number of  occurrences are: "+count);



    }
}
