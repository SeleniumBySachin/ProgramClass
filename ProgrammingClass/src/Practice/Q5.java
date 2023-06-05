package Practice;

import java.util.Iterator;
import java.util.TreeSet;

public class Q5 {
	public static void main(String[] args) {
		TreeSet h=new TreeSet();
		h.add(20);
		h.add(10);
		h.add(40);
		h.add(30);
		h.add(10);
		System.out.println(h);
		
		Iterator a = h.descendingIterator();
		while(a.hasNext()) {
			System.out.println(a.next());
		}
		System.out.println(h.descendingSet()     );
	}

}
