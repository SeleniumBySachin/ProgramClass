package Part1Progaram;

import java.util.Scanner;

public class M5 {
	public static void main(String[] args) {
		String[]s= {"Even","Odd"};
		System.out.println("Enter the number");
		Scanner s1=new Scanner(System.in);
		int num=s1.nextInt();
		System.out.println(s[num%2]);
	}

}
