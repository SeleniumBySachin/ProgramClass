package Patteren;

public class D {
	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			int a=n;
			for(int j=0;j<n;j++) {
				if(i<=j) {
					System.out.print(a+" ");
				}else {
					System.out.print("  ");
				}
				a--;
			}
			
			System.out.println();
		}
		
	}

}
