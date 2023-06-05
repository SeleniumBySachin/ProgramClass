package Practice;

import java.util.HashMap;

public class Q6 {
	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(1, "sachin");
		h.put(2, "darshan");
		h.put(3, "jayamma");
		h.put(4, "raj");
		h.put(null, "prajwal");
		System.out.println(h.containsKey(4));
		System.out.println(h.containsValue("raj"));
		System.out.println(h.get(1));
		System.out.println(h.values());
		System.out.println(h.keySet());
	//	System.out.println(h.remove(1));
		System.out.println(h.entrySet());
	}

}
