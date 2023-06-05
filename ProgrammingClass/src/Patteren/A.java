package Patteren;

public class A {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			int a=1;
			for(int j=0;j<n;j++) {
				if(i>=j) {
				if(j%2==0) {
					System.out.print(a+" ");
				}else {
					System.out.print(0+" ");
				}
				}else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
