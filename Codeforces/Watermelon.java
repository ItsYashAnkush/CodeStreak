package Codeforces;
import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        int n=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n>2 && n%2==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

    public static boolean canDivideWatermelon(int weight) {
        return weight > 2 && weight % 2 == 0;
    }   
    
}
