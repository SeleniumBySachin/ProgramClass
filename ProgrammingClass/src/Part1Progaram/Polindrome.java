package Part1Progaram;

import java.util.Scanner;

public class Polindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=s.nextInt();
		int rev=0;
		int tem=num;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(tem==rev)
			System.out.println("It is an polindrome");
		else
			System.out.println("It is not an ploindrome");
			
	}

}
