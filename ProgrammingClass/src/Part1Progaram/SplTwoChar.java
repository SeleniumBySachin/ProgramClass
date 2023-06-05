package Part1Progaram;

import java.util.Scanner;

public class SplTwoChar {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=s.nextInt();
		int sum=num%10;
		int mul=num/10;
		int res=(sum+mul)+(sum*mul);
		if(num==res)
			System.out.println("It is spl of two no");
		else
			System.out.println("It is not a spl of two");
	}

}
