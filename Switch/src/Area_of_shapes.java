import java.util.Scanner;

public class Area_of_shapes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        double area;
        switch (n){
            case 1:
                int r = in.nextInt();
                area = Math.PI*r*r;
                System.out.println("Area of Circle is : "+area);
                break;
            case 2:
                int s = in.nextInt();
                area = s*s;
                System.out.println("Area of Square is : "+area);
                break;

            case 3:
                int l = in.nextInt();
                int b = in.nextInt();
                area = l*b;
                System.out.println("Area of Rectangle is: "+ area);
                break;

            default:
                System.out.println("Enter valid choice...");
                break;
        }

    }
}
