package Part1Progaram;

import java.util.Scanner;

public class M3 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		System.out.println(num%2==0?"Even":"Odd");
	}

}
