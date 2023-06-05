package ArrayProgram;

import java.util.Scanner;

public class AvgOfElements {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the values");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		int sum=0;
		int avg=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		avg=sum/size;
		System.out.println("Avg of elements is: "+avg);
	}

}
