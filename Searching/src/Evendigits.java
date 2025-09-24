import java.util.*;

public class Evendigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.print(Even(arr));

    }

    static int Even(int[] arr){
        int count = 0;

        for(int num: arr){
            int digits = String.valueOf(num).length();

            if(digits % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
