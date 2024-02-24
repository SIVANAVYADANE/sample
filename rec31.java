import java.lang.*;
import java.util.*;


class rec31{
	static void reverse(int a[],int low,int high){
		if (low>=high) return;
		int temp=a[low];
		a[low]=a[high];
		a[high]=temp;
		reverse(a,low+1,a.length-low-1);
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]={1,4,2,5};
		reverse(a,0,a.length-1);
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
	}
}
