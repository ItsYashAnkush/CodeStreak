import java.util.*;
import java.util.Scanner;

public class Beautiful_Average {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int sum=0;
            int max=0;

            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();
                sum+=arr[i]; 
                if(arr[i] > max){
                    max=arr[i];
                }
            }
            int avg=sum/n;
            if(avg > max){
                System.out.println(avg);
            }
            else{
                System.out.println(max);
            }
        }
    }
}
