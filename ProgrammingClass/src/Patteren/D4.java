package Patteren;

public class D4 {
	public static void main(String[] args) {
		int n=10;
		char ch='A';
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j>=n-1) {
					System.out.print(ch++ +" ");
				}else {
					System.out.print("  ");
				}
			}
			for(int j=1;j<n;j++) {
				if(i>=j) {
					System.out.print(ch++ +" ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
