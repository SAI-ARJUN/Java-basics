package Binary;

import java.util.Scanner;

public class Floor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i < n;i++){
            arr[i]=in.nextInt();
        }

        int target = in.nextInt();

        System.out.print("The floor value of the array is : "+floor(arr,target));
    }

    static int floor(int[] arr,int target){
        int start = 0;
        int end= arr.length-1;

        while(start<=end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }

            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return start;
    }
}
