package Part1Progaram;

import java.util.Scanner;

public class M8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		if(a>b&&a>c)
			System.out.println("Largest no is: "+a);
		else if(b>a&&b>c)
			System.out.println("Largest no is: "+b);
		else
			System.out.println("Largest no is: "+c);
	}

}
