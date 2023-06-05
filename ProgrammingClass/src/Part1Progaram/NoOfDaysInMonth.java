package Part1Progaram;

import java.util.Scanner;

public class NoOfDaysInMonth {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the month");
		int month=s.nextInt();
		switch(month) {
		case 1,3,5,7,8,10,12:System.out.println("31 days");
		break;
		case 4,6,9,11:System.out.println("30 days");
		break;
		case 2:System.out.println("28/29 days");
		break;
		default:System.out.println("Invalid month");
		}
	}

}
