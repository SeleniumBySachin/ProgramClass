package Patteren;

public class D3 {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			int a=1;
			for(int j=0;j<n;j++) {
				if(i+j>=n-1) {
					System.out.print(a%2+" ");
					a++;
				}else {
					System.out.print("  ");
				}
			}
			for(int j=1;j<n;j++) {
				if(i>=j) {
					System.out.print(a%2+" ");
					a++;
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
