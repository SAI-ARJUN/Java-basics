import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an operator (+, -, *, /, %, or x to exit): ");
            char operator = in.next().trim().charAt(0);

            if (operator == 'x' || operator == 'X') {
                System.out.println("Exiting Calculator. Goodbye!");
                break; // stop the loop
            }

            // check for valid operator
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.print("Enter first number: ");
                int n1 = in.nextInt();

                System.out.print("Enter second number: ");
                int n2 = in.nextInt();

                int res = 0;

                if (operator == '+') {
                    res = n1 + n2;
                } else if (operator == '-') {
                    res = n1 - n2;
                } else if (operator == '*') {
                    res = n1 * n2;
                } else if (operator == '/') {
                    if (n2 != 0) {
                        res = n1 / n2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue; // skip result printing
                    }
                } else if (operator == '%') {
                    res = n1 % n2;
                }

                System.out.println("Result = " + res);
            } else {
                System.out.println("Invalid operator. Try again!");
            }
        }
    }
}
