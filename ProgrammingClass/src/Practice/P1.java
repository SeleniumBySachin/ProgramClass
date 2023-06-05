package Practice;

import java.util.ArrayList;

public class P1 {
	public static void main(String[] args) {
		String s="testyantra";
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls.contains(20));
		ArrayList ls1=new ArrayList();
		ls1.add(40);
		ls1.add(60);
		ls1.add(70);
		ls1.add(10);
	   System.out.println(ls1.retainAll(ls));
	   System.out.println(ls1);
		
		
	}

}
