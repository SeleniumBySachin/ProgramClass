package Part1Progaram;

public class S {
	public static void main(String[] args) {
		int num=12;
		if(num%2==0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		System.out.println(num%2==0?"Even":"Odd");
		switch(num%2) {
		case 0:System.out.println("Even");
		break;
		case 1:System.out.println("Odd");
		}
		String[]s= {"Even","Odd"};
		System.out.println(s[num%2]);
	}

}
