import java.lang.*;
import java.util.*;

class rec3{
	static void printNum(int n){
		if(n<1) return;
		else System.out.println(n);
		printNum(--n);
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printNum(n);
	}
}
