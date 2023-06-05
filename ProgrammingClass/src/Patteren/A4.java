package Patteren;

public class A4 {
	public static void main(String[] args) {
		int n=10;
		int a=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j>=n-1) {
					if(j%2==0) {
						System.out.print(0+" ");
					}else {
						System.out.print(1+" ");
					}
				}else
					System.out.print("  ");
				
			}
			for(int j=1;j<n;j++) {
				if(i>=j) {
					if(j%2==1) {
						System.out.print(0+" ");
					}else {
						System.out.print(1+" ");
					}
				}else
					System.out.print("  ");
			}
				
			
			System.out.println();
		}
	}
}


