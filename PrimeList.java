import java.util.Scanner;
public class PrimeList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the ending number: ");
        int num2 = input.nextInt();

        primeList(num1, num2);
    }

    static void primeList(int num1, int num2){
        for (int i = num1; i <= num2; i++){
        boolean isPrime = true;
            if (i<=1){
                isPrime = false;
            } else {
            for (int j = 2 ; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            }
            if (isPrime){
                System.out.print(i+" ");
            }

        }
    }


}

