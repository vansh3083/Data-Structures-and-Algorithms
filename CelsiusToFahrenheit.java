import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Celsius: ");
        float c = input.nextFloat();

        float f = c * 1.8f + 32;

        System.out.print("Temperature in Fahrenhein is: "+ f);


    }
}
