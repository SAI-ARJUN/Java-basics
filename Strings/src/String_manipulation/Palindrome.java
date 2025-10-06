package String_manipulation;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        String reversed = new StringBuilder(word).reverse().toString();

        if(word.equalsIgnoreCase(reversed)){
            System.out.println("'"+ word + "' is a palindrome");
        }
        else {
            System.out.println("'" + word + "' is not a palindrome");
        }

    }
}
