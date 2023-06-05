package Part1Progaram;

import java.util.Scanner;

public class SumOfNthNo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Start");
		int start=s.nextInt();
		System.out.println("End");
		int end=s.nextInt();
		int sum=0;
		while(end>=start) {
			sum=sum+start;
			start++;
		}
		System.out.println(sum);
	}

}
