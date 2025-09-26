package Linear;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2Darrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter no.of rows for the array : ");
        int row = in.nextInt();
        System.out.print("Enter no.of columns for the array : ");
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        System.out.print("Enter values for the 2D array : ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                arr[i][j]=in.nextInt();
            }
        }

        System.out.print("Enter the target value to search in the array : ");
        int target = in.nextInt();

        int[] ans = Search(arr,target);
        System.out.println("The target value is found at the "+Arrays.toString(ans)+" matrix");
    }

    static int[] Search(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
