import java.util.Scanner;

public class CountingOccurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = in.nextInt();
        System.out.print("Enter the target to count : ");
        int target = in.nextInt();
        int count = 0;

        while(n!=0){
            int rem = n % 10;
            if(rem == target){
                count++;
            }
            n/=10;
        }
        System.out.println("Count : "+count);


    }
}
