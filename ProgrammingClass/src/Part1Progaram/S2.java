package Part1Progaram;

import java.util.Scanner;

public class S2 {
	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the subject marks");
		 int sql=s.nextInt();
		 int mt=s.nextInt();
		 int java=s.nextInt();
		 int sel=s.nextInt();
		 while(sql>35||mt>35||java>35||sel>35) {
			 int per=(sql+mt+java+sel)/4;
			 if(per>85)
				 System.out.println("Distiction");
			 else if(per>60&&per<84)
				 System.out.println("First class");
			 else
				 System.out.println("pass");
		 }
	}

}
