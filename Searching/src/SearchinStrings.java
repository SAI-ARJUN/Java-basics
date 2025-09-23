import java.util.Scanner;

public class SearchinStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name = in.nextLine();
        char target = in.next().charAt(0);
        boolean ans = search_in(name,target);
        System.out.println(ans);
    }

    static boolean search_in(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(int i =0;i<str.length();i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;


    }
}
