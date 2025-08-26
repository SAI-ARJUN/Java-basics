import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String dep = in.next();

        switch (n){
            case 1:
                System.out.println("Sai Arjun");
                break;
            case 2:
                System.out.println("CSBS Department");
                break;
            case 3:
                switch (dep) {
                    case "IT" -> System.out.println("IT Department");
                    case "CSE" -> System.out.println("CSE Department");
                    default -> System.out.println("Enter valid department !");
                }
                break;
            default:
                System.out.println("Enter valid choice!");
                break;
        }
    }
}
