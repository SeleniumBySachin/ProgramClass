package Part1Progaram;

import java.util.Scanner;

public class SubjectMarks {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the subject marks");
		int java=s.nextInt();
		int mt=s.nextInt();
		int sel=s.nextInt();
		int sql=s.nextInt();
		if(java>35&&mt>35&&sel>35&&sql>35) {
			int per=(java+mt+sel+sql)/4;
			if(per>=85)
				System.out.println("Distiction");
				else if(per>=60&&per<=84)
					System.out.println("1st class");
				else
					System.out.println("Pass");
		}
		else
			System.out.println("Fail");

	}

}
