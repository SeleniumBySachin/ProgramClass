package Part1Progaram;

import java.util.Scanner;

public class M4 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		switch(num%2){
		case 0:System.out.println("Even");
		break;
		case 1:System.out.println("Odd");
		
		}
		
	}

}
