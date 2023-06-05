package Practice;

import java.util.TreeMap;

public class Q7 {
	public static void main(String[] args) {
		TreeMap h=new TreeMap();
		h.put(1, "sachin");
		h.put(2, "darshan");
		h.put(3, "jayamma");
		h.put(4, "raj");
		h.put(1, "prajwal");
		System.out.println(h.entrySet());
	}

}
