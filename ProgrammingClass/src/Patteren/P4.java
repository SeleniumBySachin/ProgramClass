package Patteren;

public class P4 {
	public static void main(String[] args) {
		int row=4;
		int col=5;
		int k=1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==0||j==0||i==row-1||j==col-1) {
					System.out.print(k++ +" ");
					if(k==10) {
						k=1;
					}
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
         
	}
}


