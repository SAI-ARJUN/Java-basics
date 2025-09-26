package Linear;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the values for the array : ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        System.out.print("The minimum element in the array is : "+ Minimum(arr,n));

    }

    static int Minimum(int[] arr,int n){
        int min = arr[0];

        for(int i=0;i<n;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
