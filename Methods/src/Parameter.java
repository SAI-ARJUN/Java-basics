import java.util.Scanner;

public class Parameter {

//    public static void main(String[] args) {
//        int ans = sum(10,20);
//        System.out.println(ans);
//
//    }
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = in.nextLine();
        String welcome = myGreet(name);
        System.out.println(welcome);

    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;

    }

    static int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
}
