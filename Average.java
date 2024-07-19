import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int e = input.nextInt();
        int sum=0;

        for (int i =1; i <=e; i++)
        {
            int m =input.nextInt();
            sum += m;
        }

        float avg = (float) sum /e;
        System.out.print("The average is " + avg);
    }
}
