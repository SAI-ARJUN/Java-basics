import java.util.Scanner;

public class CompareTriplets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter size for first array: ");
        int n1 = in.nextInt();

        System.out.print("Enter size for second array: ");
        int n2=in.nextInt();

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for(int i=0;i<n1;i++){
            arr1[i]=in.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i]=in.nextInt();
        }

        int alice=0,bob=0;

        for(int i=0;i<n1;i++){
            if(arr1[i]>arr2[i]){
                alice++;
            }
            else if(arr1[i]<arr2[i]){
                bob++;
            }
        }

        System.out.println("Resulted array : "+alice+" "+bob);
    }
}
