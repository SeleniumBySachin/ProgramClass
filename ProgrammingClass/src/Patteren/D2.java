package Patteren;

public class D2 {
	public static void main(String[] args) {
		int n=4;
		int a=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j>=n-1) {
					System.out.print(2*a+" ");
					a++;
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
