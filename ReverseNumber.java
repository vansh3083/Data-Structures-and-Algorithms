import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = input.nextLong();
        long rev_num=0;

        while(num!=0){

            long temp = num % 10;
            rev_num = rev_num*10 + temp;
            num = num/10;
        }

        System.out.print("Reverse number is: "+rev_num);

    }
}

