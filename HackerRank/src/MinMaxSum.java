import java.util.*;


public class MinMaxSum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        long[] arr = new long[5];

        for(int i=0;i<5;i++){
            arr[i]=in.nextLong();
        }

        long total=0;
        long min=arr[0],max=arr[0];

        for(long num : arr){
            total+=num;
            if(num<min)min=num;
            if(num>max)max=num;
        }
        long minSum = total-max;
        long maxSum = total-min;

        System.out.println(minSum+" "+maxSum);
    }
}