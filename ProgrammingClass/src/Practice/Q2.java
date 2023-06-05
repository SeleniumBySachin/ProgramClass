package Practice;

import java.util.ArrayList;

public class Q2 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		for(Object w:ls) {
			int a=(int)w;
			if(a==20) {
				ls.set(1, 100);
			}
		}
		System.out.println(ls);
	}

}
