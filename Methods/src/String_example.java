public class String_example {

    public static void main(String[] args) {

        String message = greet();
        System.out.println(message);


    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;

    }


    static String greet(){
        String greeting = "Hi";
        return greeting;
    }
}
