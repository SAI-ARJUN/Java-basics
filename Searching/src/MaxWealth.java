import java.util.Scanner;

public class MaxWealth {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter no.of rows : ");
        int row = in.nextInt();
        System.out.print("Enter no.of columns : ");
        int col = in.nextInt();

        int[][] arr = new int[row][col];

        System.out.print("Enter values for the 2D array :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=in.nextInt();
            }
        }

        int ans = maximumWealth(arr);

        System.out.println("The maximum wealth array is : "+ans);

    }

    public static int maximumWealth(int[][] accounts) {


        int max = 0;
        for(int person = 0; person<accounts.length;person++){
            int sum = 0;
            for(int account = 0; account<accounts[person].length;account++){
                sum+=accounts[person][account];
            }

            if(sum>max){
                max=sum;
            }
        }
        return max;


    }

}
