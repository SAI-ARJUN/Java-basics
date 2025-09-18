import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//
//        int n = in.nextInt();
//        boolean ans = isArmstrong(n);
//        System.out.println(ans);
        for(int i = 100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }

        }
    }
    static boolean isArmstrong(int num){
        int original = num;
        int sum = 0;
        while(num>0){
            int rem = num%10;
            num/=10;
            int cube = rem*rem*rem;
            sum+=cube;
        }
        return sum == original;
    }

    }

