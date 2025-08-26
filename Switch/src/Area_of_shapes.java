import java.util.Scanner;

public class Area_of_shapes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int area;
        switch (n){
            case 1:
                int r = in.nextInt();
                area = Math.PI*r*r;
                System.out.println(area);

        }
    }
}
