package String_manipulation;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine();

        String reversed = new StringBuilder(word).reverse().toString();

        System.out.println(reversed);
    }
}
