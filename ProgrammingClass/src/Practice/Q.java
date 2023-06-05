package Practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Q {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		/*for(int i=0;i<ls.size();i++) {
			System.out.println(ls.get(i));
		}*/
		Iterator i=ls.iterator();
		while(i.hasNext()) {
			int a=(int)i.next();
			if(a==40) {
				i.remove();
			}else {
				System.out.println(a);
			}
		}
	}
}
