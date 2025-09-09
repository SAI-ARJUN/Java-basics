import java.util.*;

public class LeftRotate {

    public static void reverse(int[] arr,int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
    }

    public static int[] rotateLeft(int d, int[] arr){
        int n = arr.length;

        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);

        return arr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int d = in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        int[] result = rotateLeft(d,arr);

        for(int num:result){
            System.out.print(num+" ");
        }
        in.close();

    }
}
