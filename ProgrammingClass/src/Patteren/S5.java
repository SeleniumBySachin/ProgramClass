package Patteren;

public class S5 {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j||i==0) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			for(int j=1;j<n;j++) {
				if(i==0||i+j==n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j==n-1||i==n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			for(int j=1;j<n;j++) {
				if(i==j||i==n-1) {		
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		
	}

}
