package Patteren;

public class S3 {
	public static void main(String[] args) {
		int n=10;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n-1||i+j==n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(j==n-1||i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
	}

}
