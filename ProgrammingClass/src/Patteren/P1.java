package Patteren;

public class P1 {
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<5;i++) {
			int k=1;
			char ch='a';
			for(int j=0;j<n;j++) {
				if(i==2) {
					System.out.print("$ ");
				}
				else if(i%2==0) {
					System.out.print(ch++ +" ");
				}
				else
					System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}

}
