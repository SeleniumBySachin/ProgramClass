package Patteren;

public class D1 {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++) {
			int a=1;
			char ch='a';
			for(int j=0;j<n;j++) {
				if(j>=i) {
					if(i%2==0) {
						System.out.print(a++ +" ");
					}else {
						System.out.print(ch++ +" ");
					}
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
