import java.util.*;
import java.util.Scanner;

public class Candies_for_Nephews {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); 

        for(int i=0; i<n; i++){
            int no=sc.nextInt();
            int ans=no%3;
            System.out.println(no/3);
            System.err.println(ans);

        }
    }
}
