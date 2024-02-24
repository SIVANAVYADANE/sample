import java.lang.*;
import java.util.*;

class rec4{
	static void printNum(int n){
		if(n<1) return;
		else printNum(n-1);
		System.out.println(n);
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int c=1,n=sc.nextInt();
		printNum(n);
	}
}
