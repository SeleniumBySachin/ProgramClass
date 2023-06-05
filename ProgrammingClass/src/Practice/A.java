package Practice;

interface C{
	void test();
}

interface B{
	void print() ;
}

public class A implements B, C {
    public void test() {
    	 System.out.println("###");
     }
    public void print() {
    	System.out.println("***");
    }
    
    public static void main(String[] args) {
		C o=new A();
		B b=new A();
		C c=(C)b;
		c.test();
		B b1=(B)c;
		b1.print();    
    }
}

