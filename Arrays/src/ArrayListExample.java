import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);

//        list.add(100);
//        list.add(101);
//        list.add(102);
//        list.add(103);
//        list.add(104);
//
//        System.out.println(list);
//
//        list.set(4,105);
//        System.out.println(list);

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        for(int i=0;i<n;i++){
            list.add(in.nextInt());
        }
        for(int i=0;i<n;i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
