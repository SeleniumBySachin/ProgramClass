package Part1Progaram;

import java.util.Scanner;

public class M10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no student object");
		int size=s.nextInt();
		int []a=new int[size];
		System.out.println("Enter the student marks");
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("Result");
		for(int i=0;i<a.length;i++) {
			if(a[i]>35) {
				System.out.println("passed: "+a[i]);
			}
			else
				System.out.println("Failed: "+a[i]);
		}
	}

}
