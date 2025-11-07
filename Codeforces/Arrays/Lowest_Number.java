import java.util.*;

public class Lowest_Number{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int min_val=Integer.MAX_VALUE;
        int index=0;

        for(int i=0; i<n; i++){
            int val=sc.nextInt();
            
            if(val < min_val){
                min_val=val;
                index=i+1;
            }
        }

        System.out.println(min_val+" "+index);
    }
}