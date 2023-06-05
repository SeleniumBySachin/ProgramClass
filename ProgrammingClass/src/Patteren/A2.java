package Patteren;

public class A2 {
	public static void main(String[] args) {
		int n=10;
		int a=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i+j<=n-1) {
					if(i%2==0) {
						System.out.print(1+" ");
					}
					else {
						System.out.print(0+" ");
					}
				}else {
					System.out.print("  ");
				}
			
			}
			System.out.println();
		}
	}

}
