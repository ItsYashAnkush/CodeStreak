import java.util.*;

public class Boy_or_Girl {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

    // ------------------------- Brute Force Approach -------------------------
        // int count=s.length();

        // for(int i=0; i<s.length(); i++){
        //     char ch=s.charAt(i);

        //     for(int j=i+1; j<s.length(); j++){
        //         if(ch==s.charAt(j)){
        //             count--;
        //             break;
        //         }
        //     }
        // }
        // if(count%2==0){
        //     System.out.println("CHAT WITH HER!");
        // }else{
        //     System.out.println("IGNORE HIM!");
        // }
    // ------------------------- Optimal Approach -------------------------
        Set<Character> set = new HashSet<>();

        for(char ch:s.toCharArray()){
            set.add(ch);
        }

        if(set.size()%2 == 0){
            System.out.println("CHAT WITH HER!");
        }else{
            System.out.println("IGNORE HIM!");
        }
    }
}