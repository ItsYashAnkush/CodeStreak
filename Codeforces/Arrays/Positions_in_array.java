import java.util.*;

public class Positions_in_array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];

        for(int i=0; i<N; i++){
            int val=sc.nextInt();
            if(val <= 10){
                arr[i] = val;
            }
            else{
                arr[i]=-1;
            }
        }

        for(int i=0; i<N; i++){
            if(arr[i]!=-1){
            System.out.println("A["+i+"] = "+arr[i]);                
            }
        }
    }
}
