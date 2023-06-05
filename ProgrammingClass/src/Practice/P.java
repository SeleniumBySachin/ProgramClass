package Practice;

class P2 {
	public static void main(String[] args) {
		int a=2;
		int num=7;
		int count=0;
		while(a<num) {
			if(num%a==0) {
				count++;
				break;
			}
			a++;
		}
		if(count==0) {
			System.out.println("prime");
		}else {
			System.out.println("not a prime");
		}
		
	}
}

