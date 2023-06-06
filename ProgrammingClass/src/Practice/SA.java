package Practice;

public class SA {
	public static void main(String[] args) {
		String s="$200.34";
		double []a= {218.30,30.345,200.120,560.90};
		char[] ch = s.toCharArray();
		String s1="";
		for(int i=0;i<ch.length;i++) {
			String s2=ch[i]+"";
			if(s2.contains("$")) {
				
			}else {
				s1=s1+s2;
			}
		}
		
		double big=Double.parseDouble(s1);
		System.out.println(big);
		//double big=d;
		for(int i=0;i<a.length;i++) {
			if(a[i]>big) {
				big=a[i];
			}
		}
		System.out.println(big);
		
	}

}
