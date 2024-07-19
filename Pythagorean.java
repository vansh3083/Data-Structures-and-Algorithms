import java.util.Scanner;
public class Pythagorean {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        System.out.print(isTriplet(n1,n2,n3));
    }

    static String isTriplet(int a,int b, int c){
        int d = Math.max(a,b);
        int max = Math.max(d,c);

        if(a * a + b * b == c * c || a*a + c*c == b * b || b*b + c*c == a*a) {
            return "It is a pythagorean Triplet";
        }
        else {
            return "It is not a pythagorean Triplet";
        }
    }
}
