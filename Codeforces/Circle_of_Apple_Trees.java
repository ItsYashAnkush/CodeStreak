import java.lang.reflect.Array;
import java.util.*;

public class Circle_of_Apple_Trees {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();
        while(t-- > 0){
            int n=sc.nextInt(); // number of trees
            int count=1;
            int arr[]=new int[n];

            for(int i=0;i<n; i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=1; i<n; i++){
                if(arr[i] > arr[0] && arr[i] != arr[i-1]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }    
}
