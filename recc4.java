import java.lang.*;
import java.util.*;

class recc4{
	static void printNum(int c,int n){
		if(c<1) return;
		else printNum(--c,n);
		System.out.println(n);
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),c=n;
		printNum(c,n);
	}
}
