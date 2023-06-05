package ArrayProgram;

import java.util.Scanner;

public class SmallNo {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the values");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		int small=a[0];
		for (int i = 1; i < a.length; i++) {
			if(a[i]<small)
				small=a[i];
		}
		System.out.println("Small element is: "+small);
	}

}
