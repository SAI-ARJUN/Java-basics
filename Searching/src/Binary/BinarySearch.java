package Binary;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the values of the array : ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        System.out.print("Enter the target value to search : ");

        int target = in.nextInt();

        int ans = Binary(arr,target);
        System.out.print("The target value found at the index : "+ans);

    }

    static int Binary(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
