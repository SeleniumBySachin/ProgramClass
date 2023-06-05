package Part1Progaram;
//largest no two no
public class S1 {
	public static void main(String[] args) {
		int a=10;
		int b=90;
		int c=40;
		int big=a;
		if(b>big)
			big=b;
		if(c>big)
			big=c;
		System.out.println(big);
		int lar=a>b?a:b;
		int lar1=lar>c?lar:c;
		System.out.println(lar1>lar?lar1:lar);
	}

}
