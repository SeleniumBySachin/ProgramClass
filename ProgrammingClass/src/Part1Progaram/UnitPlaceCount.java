package Part1Progaram;

import java.util.Scanner;

public class UnitPlaceCount {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=s.nextInt();
		System.out.println("Num are");
		while(num>0) {
			int rem=num%10;
			System.out.println(rem);
			num=num/10;
		}
	}

}
