package Codeforces;
import java.util.Scanner;

public class Team{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;

		for(int i=0;i<n; i++){
			int Petya=sc.nextInt();
			int Vasya=sc.nextInt();
			int Tonya=sc.nextInt();

			if(Petya + Vasya + Tonya >= 2){
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}