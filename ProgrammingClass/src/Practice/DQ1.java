package Practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class DQ1 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		
		ListIterator i=ls.listIterator();
		while(i.hasNext()) {
			int a=(int)i.next();
			if(a==20) {
				//i.set(100);
				//i.remove();
				//i.add(200);
			}
		}
		System.out.println(ls);
	}

}
