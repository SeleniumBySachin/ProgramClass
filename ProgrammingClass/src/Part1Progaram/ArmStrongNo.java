package Part1Progaram;

import java.util.Scanner;

public class ArmStrongNo {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no");
		int num=s.nextInt();
		String res=isArmStrongNo(num);
		System.out.println(res);
	}
	public static String isArmStrongNo(int num) {
		int temp=num;
		int temp1=temp;
		int sum=0;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		while(temp>0) {
			int rem=temp%10;
			int prod=1;
			int power=count;
			while(power>0) {
				prod=prod*rem;
				power--;
			}
			sum=sum+prod;
			temp=temp/10;
		}
		if(temp1==sum)
			return "ArmStrong";
		else
			return "Not a armStrongno";
	}

}
