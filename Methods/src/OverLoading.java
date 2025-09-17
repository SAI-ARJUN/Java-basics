public class OverLoading {
    public static void main(String[] args) {
        int ans = add(20,30);
        System.out.println(ans);
        int ans1 = add(10,20,30);
        System.out.println(ans1);
    }

    public static int add(int a,int b){
        System.out.print("First : ");
        return a+b;
    }

    public static int add(int a,int b,int c){
        System.out.print("Second : ");
        return a+b+c;
    }
}

// Method overloading is divided based on the parameter with the same name

// It may have same data type with different number of variables 
