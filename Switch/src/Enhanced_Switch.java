import java.util.Scanner;

public class Enhanced_Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();


        switch (fruit) {
            case "Mango" -> System.out.println("Sweet in taste");
            case "Strawberry" -> System.out.println("Used to make cakes...");
            case "Grapes" -> System.out.println("Good for health");
            default -> System.out.println("Enter valid fruit names");
        }
    }
}

