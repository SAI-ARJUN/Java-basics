import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int a = 0;
        int b = 1;
//        int count = 2;
//
//        while(count<=n){
//            int temp = b;
//            b+=a;
//            a = temp;
//            count++;
//        }
//        Output:
//        7
//        13

        System.out.print(a+" "+b);

        for(int count = 2; count<=n;count++){
            int next = a+b;
            System.out.print(" "+next);
            a=b;
            b=next;
        }
    }
}
