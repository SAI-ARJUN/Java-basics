import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter values for array: ");
        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Result array: "+Arrays.toString(arr));
    }
}
