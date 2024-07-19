import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long num = in.nextLong();
        long copy = num;
        long rev_num=0;
        while(num > 0){
            long temp = num % 10;
            rev_num = rev_num*10 + temp;
            num = num/10;
        }

        if (rev_num == copy){
            System.out.println("PALINDROME");
        }
        else{
            System.out.println("NOT PALINDROME");
        }

    }
}

