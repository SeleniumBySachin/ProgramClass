package Practice;

import java.util.Hashtable;

public class Q8 {
	public static void main(String[] args) {
		Hashtable h=new Hashtable();
		h.put(1, "sachin");
		h.put(2, "darshan");
		h.put(3, "jayamma");
		h.put(4, "raj");
	//	h.put(null, null);
		System.out.println(h.entrySet());
	}

}
