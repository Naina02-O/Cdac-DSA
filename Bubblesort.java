
import java.util.Scanner;

public class Bubblesort {
	
	static void sort(int []a,int i,int n) {
		int j=1;
		int counter=0,swapc=0,swapt=0;
		boolean swap = false;
		
		for(i=0;i<n;i++) {
			counter++;
			swap=false;
			for(j=1;j<n-i;j++) {
				
				if(a[j-1]>a[j]) {
					swap=true;
					swapc++;
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;	
				}
			}
		
		if(swap) {
			System.out.println("swap happened. "+swapc);
			swapt+=swapc;
			swapc=0;
		} else {
			System.out.println("array is sorted after " +--counter+ " passes and "+swapt+ " swaps" );
			break;
		}
	}	
	}
	public static void main(String[] args) {
		int i=0;
		int [] a=new int[100];
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		System.out.println("enter the elements to be sorted");
		
		for(i=0;i<n;i++) {
		a[i]=sc.nextInt();
		}
		
		sort(a,i,n);
		System.out.println("sorted array is");
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
			}
		
		sc.close();
	}
}
