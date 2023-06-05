package ArrayProgram;

import java.util.Scanner;

public class LargestString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		String[]name=new String[size];
		System.out.println("Enter the names");
		s.nextLine();
		for (int i = 0; i < name.length; i++) {
			name[i]=s.nextLine();
		}
		int len=name[0].length();
		String s1=name[0];
		for (int i = 0; i < name.length; i++) {
			int a=name[i].length();
			if(a>len) {
			 s1=name[i];
			}
		}
		System.out.println("Largest name is: "+s1);
	}

}
