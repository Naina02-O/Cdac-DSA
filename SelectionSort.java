

import java.util.Scanner;

public class SelectionSort {
	
	static void sort(int []a,int i,int n) {
		int j=1;
		int counter=0,swapc=0,swapt=0;
		boolean swap = false;
		
		for(i=0;i<n;i++) {
			counter++;
			int min=i;
			for(j=i+1;j<n;j++) {
				
				if(a[j]<a[min]) {
					swap=true;
					min=j;
					
						
				}
				swapc++;
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
			
			
			
			if(swap) {
				System.out.println("swap happened. "+swapc);
				swapt+=swapc;
				swapc=0;
			}
			else {
				System.out.println("array is sorted after " +--counter+ " passes and "+swapt+ " swaps" );
				break;
			}
		}
		
				
	}

	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int i=0;
			int [] a=new int[100];
			
					
			
			System.out.println("enter the size of array");
			int n=sc.nextInt();
			System.out.println("enter the elements to be sorted");
			
			for(i=0;i<n;i++) {
			a[i]=sc.nextInt();
			}
			
			sort(a,i,n);
			System.out.println("sorted array is:");
			for(i=0;i<n;i++) {
				System.out.println(a[i]);
				}
			
			sc.close();
	      }
		
}
