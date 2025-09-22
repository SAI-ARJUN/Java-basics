import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the values for array : ");

        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the target value : ");
        int target = in.nextInt();

        int ans = lin_Search(arr,target);
        System.out.println("The target element is found at the index : "+ans);
    }

    static int lin_Search(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index=0;index<arr.length;index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}
