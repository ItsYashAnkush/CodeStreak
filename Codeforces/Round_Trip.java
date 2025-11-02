import java.util.*;

public class Round_Trip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        
        for(int i=0; i<n; i++){
            int R=sc.nextInt();
            int X=sc.nextInt();
            int D=sc.nextInt();
            int m=sc.nextInt();

            String s=sc.next();
            int ratedCount = 0;

            for (char c : s.toCharArray()) {
                if (c == '1') {  // Div.1 always rated
                    ratedCount++;
                    R = Math.max(0, R - D); // minimize rating to stay under X
                } else { // Div.2
                    if (R < X) {  // only rated if rating < X
                        ratedCount++;
                        R = Math.max(0, R - D); // minimize again
                    } // else unrated -> rating unchanged
                }
            }

            System.out.println(ratedCount);

        }
    }
}
