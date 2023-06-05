package Part1Progaram;

import java.util.Scanner;

public class M2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		if(num/2*2==num)
			System.out.println("Even");
		else
			System.out.println("Odd");
	}

}
