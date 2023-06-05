package Practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class Q1 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		
		ListIterator i=ls.listIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("===========");
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		System.out.println("===========");
		ListIterator i1=ls.listIterator(2);
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		System.out.println("===========");
		ListIterator i2=ls.listIterator(ls.size());
		while(i2.hasPrevious()) {
			System.out.println(i2.previous());
		}
		
	}

}
