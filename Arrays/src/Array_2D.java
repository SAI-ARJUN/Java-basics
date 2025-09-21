import java.util.Scanner;

public class Array_2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int row = in.nextInt();
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = in.nextInt();
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
