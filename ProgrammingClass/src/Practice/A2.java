package Practice;

public class A2 {
	public static void main(String[] args) {
		char[]ch= {'a','b','c','d'};
		String s = String.valueOf(ch);
		System.out.println(s);
		char[]s1=s.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			System.out.println(s1[i]);
		}
		char[]a= new char[s.length()];
		for(int i=0;i<s.length();i++) {
			a[i]=s.charAt(i);
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}

}
