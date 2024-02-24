import java.lang.*;
import java.util.*;

class rec5{
	static void printNum(int i,int n){
		if(i>n) return;
		else printNum(i+1,n);
		System.out.println(i);
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int c=1,n=sc.nextInt();
		printNum(c,n);
	}
}
