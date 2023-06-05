package Practice;

public class A10 {
	public static void main(String[] args) {
		test(1,2);
		test(2,3,4);
		
	}
	static void test(int...a) {
		int sum=0;
		for (int i = 0; i < a.length; i++) {
		sum=sum+a[i];	
		}
		System.out.println(sum);
	}

}
