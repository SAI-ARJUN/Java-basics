import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int pos=0,neg=0,zero=0;
        for(int num : arr){
            if(num>0)pos++;
            else if(num<0)neg++;
            else zero++;
        }

        System.out.printf("%.6f%n",(double) pos/n);
        System.out.printf("%.6f%n",(double) neg/n);
        System.out.printf("%.6f%n",(double) zero/n);

    }
}
