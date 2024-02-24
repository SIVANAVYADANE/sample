import java.lang.*;
import java.util.*;


class rec21{
	static void printSum(int n,int sum){
		if (n<1){
			System.out.println(sum);
			return;
		}
		printSum(n-1,sum+n);
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printSum(n,0);
	}
}
