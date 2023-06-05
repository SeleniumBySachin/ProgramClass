package Part1Progaram;

import java.util.Scanner;

public class M9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int marks=35;
		System.out.println("Enter Sheela marks");
		int a=s.nextInt();
		System.out.println("Enter Leela marks");
		int b=s.nextInt();
		System.out.println("Enter Dinga marks");
		int c=s.nextInt();
		System.out.println("Enter Penga marks");
		int d=s.nextInt();
		System.out.println("==============");
		System.out.println("passed & failed student details");
		if(a>marks)
			System.out.println(a+" :Sheela pass");
		else
			System.out.println(a+" :Sheela fail");
		if(b>marks)
			System.out.println(b+" :Leela pass");
		else
			System.out.println(b+" :Leela fail");
		if(c>marks)
			System.out.println(c+" :Dinga pass");
		else
			System.out.println(c+" :Dinga fail");
		if(d>marks)
			System.out.println(d+" :Penga pass");
		else
			System.out.println(d+" :Penga fail");
		
		
		
	}

}
