import java.util.Scanner;

public class MaxVal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the values for array : ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        System.out.println("The maximum value of the given array is : "+ max(arr));
    }

    static int max(int[] arr){
        int maxVal = arr[0];

        for(int i=1;i<arr.length;i++){
            if(maxVal < arr[i]){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
