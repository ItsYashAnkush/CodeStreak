import java.util.*;
import java.util.Scanner;

public class El_fucho {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int no=0;

        for(int i=0; i<n; i++){
            no=sc.nextInt();
            System.out.println(2*(no-1));
            no=0;
        }
    }
}
