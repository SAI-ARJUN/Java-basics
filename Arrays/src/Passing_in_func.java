import java.util.Arrays;
import java.util.Scanner;

public class Passing_in_func {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();
        String[] arr = new String[n];

        System.out.print("Enter Array : ");
        for(int i=0;i<n;i++){
            arr[i]=in.next();
        }


        System.out.println("Result array : "+Arrays.toString(arr));

        change(arr);
        System.out.print("Result array after the function implementation : "+Arrays.toString(arr));

    }
    static void change(String[] arr1){
        arr1[0]="Arjun";
    }
}
