import java.util.Scanner;

public class Celsius_to_Fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Celsius degree: ");
        float Celsius = input.nextFloat();


        float Fahrenheit = (Celsius * 9/5) + 32;

        System.out.println("Fahrenheit degree is : "+Fahrenheit);
    }
}
