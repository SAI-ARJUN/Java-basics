package Binary;

import java.util.Scanner;

public class Ceiling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        int target = in.nextInt();

        System.out.print("The Ceiling of the given array is : "+findCeiling(arr,target));
    }
    static int findCeiling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int ceiling=-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid] == target){
                return arr[mid];
            }

            else if(arr[mid]<target){
                start = mid+1;
            }

            else{
                ceiling=arr[mid];
                end=mid-1;
            }
        }
        return ceiling;

    }
}
