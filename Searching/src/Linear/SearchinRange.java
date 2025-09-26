package Linear;

import java.util.Scanner;

public class SearchinRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the values for the array : ");
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the target value : ");
        int target = in.nextInt();

        System.out.print("Enter the start index : ");
        int start = in.nextInt();

        System.out.print("Enter the end index : ");
        int end = in.nextInt();

        int ans = range(arr,target,start,end);

        System.out.print("The element is found at the index : "+ans);

    }

    static int range(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }

        for(int index = start; index<=end;index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
