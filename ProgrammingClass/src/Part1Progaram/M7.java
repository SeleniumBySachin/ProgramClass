package Part1Progaram;

import java.util.Scanner;

public class M7 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int big=a>b?a:b;
		int big1=c>big?c:big;
		System.out.println(big>big1?big:big1);
	}

}
