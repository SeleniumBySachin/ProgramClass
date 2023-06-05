package Practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Q4 {
	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add(20);
		h.add(10);
		h.add(40);
		h.add(30);
		h.add(10);
		System.out.println(h);
		Iterator i=h.iterator();
		while(i.hasNext()) {
			int a=(int)i.next();
			if(a==20) {
				i.remove();
			}
		}
		System.out.println(h);
	}
	

}
