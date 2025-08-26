import java.util.Scanner;

public class Traffic_light {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String light = in.next();

        switch (light){
            case "Red" -> System.out.println("Stop");
            case "Yellow" -> System.out.println("Get set");
            case "Green" -> System.out.println("Go...");
            default -> System.out.println("Invalid light. Enter valid light color !");
        }
    }
}
