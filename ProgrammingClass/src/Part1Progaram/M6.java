package Part1Progaram;

import java.util.Scanner;

public class M6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int big=a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
		System.out.println("The largest no is: "+big);
	}

}
