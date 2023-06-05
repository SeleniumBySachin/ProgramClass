package Patteren;

public class A1 {
	public static void main(String[] args) {
		int n=7;
		int a=1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
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
