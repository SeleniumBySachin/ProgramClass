package Part1Progaram;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num=6;
		int a=0;
		int b=1;
		int sum=0;
		System.out.println(a);
		System.out.println(b);
		while(num>0) {
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
			num--;
		}
	}
}
