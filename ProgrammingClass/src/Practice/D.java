package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D {
	public static void main(String[] args) throws IOException {
		String s="D://ProgrammingClass/src/Practice/h.txt";
		FileOutputStream fos=new FileOutputStream(s);
		String s1="Sheela is imaginary girl";
		byte[] b = s1.getBytes();
		fos.write(b);
		System.out.println("added");
		FileInputStream fis=new FileInputStream(s);
	/* byte[]b1=new byte[fis.available()];
		fis.read(b1);
		/for (int i = 0; i < b1.length; i++) {
			System.out.print((char)b1[i]);
		}*/
		while(fis.available()!=0) {
			System.out.print((char)fis.read());
		}
		
	}

}
