import java.util.Scanner;

public class FindMaxin2D {
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

        
        System.out.print("The maximum value in the 2D array is : "+search(arr));
    }

    static int search(int[][] arr){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){

                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
