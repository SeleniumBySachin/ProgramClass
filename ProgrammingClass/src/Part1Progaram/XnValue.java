package Part1Progaram;

import java.util.Scanner;

public class XnValue {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("x value");
		int x=s.nextInt();
		System.out.println("n value");
		int n=s.nextInt();
		int prod=1;
		while(n>0) {
			prod=prod*x;
			n--;
		}
		System.out.println(prod);
	}

}
