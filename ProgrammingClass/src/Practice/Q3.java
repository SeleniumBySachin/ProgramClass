package Practice;

import java.util.ArrayList;
import java.util.Collections;

public class Q3 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(50);
		ls.add(40);
		ls.add(20);
		ls.add(10);
		
		/*Object[] a = ls.toArray();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}*/
		Collections.sort(ls);
		System.out.println(ls);
	}

}
