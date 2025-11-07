import java.util.*;

public class Replacement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];

        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            if(val == 0){
                arr[i]=0;
            }
            else if(val > 0){
                arr[i]=1;
            }
            else{
                arr[i]=2;
            }
        }
        for(int a:arr){
            System.out.print(a+" ");
        }
        
    }
}