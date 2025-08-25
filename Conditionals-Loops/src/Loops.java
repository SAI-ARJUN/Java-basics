import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        Syntax of for loop:
        for(initailisation; condition; increment/decrement){
            //body
        }
         */

        //Print numbers from 1 to 5

//        for(int n = 1; n<=5;n++){
//            System.out.print(n);
//        }

        int n = in.nextInt();

//        for (int i = 1; i <= n ; i++) {
//            System.out.print(i+" ");
//
//        }

        int num = 1;
//        while(num<=n){
//            System.out.print(num+" ");
//            num++;
//        }
        do{
            System.out.print(num+" ");
            num++;
        }while(num<=n);
    }
}
