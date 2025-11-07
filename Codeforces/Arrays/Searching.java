import java.util.*;

public class Searching {
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();         // total no of values
            int arr[] = new int[n];     // array store all values
            int ans=-1;
            
            for(int i=0; i<n; i++){
                arr[i]=sc.nextInt();    
            }
            int x=sc.nextInt();     // target integer

            for(int i=0; i<n; i++){
                if(arr[i]==x){
                    ans=i;
                    break;
                }   
            }

                System.out.println(ans);

    }
}
