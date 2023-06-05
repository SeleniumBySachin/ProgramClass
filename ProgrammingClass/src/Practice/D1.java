package Practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class D1 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String s="D://ProgrammingClass/src/Practice/object.txt";
		FileOutputStream fos=new FileOutputStream(s);
		ObjectOutputStream o=new ObjectOutputStream(fos);
		o.writeObject(new Emp("sheela",1000,101));
		System.out.println("added");
		
		FileInputStream fil=new FileInputStream(s);
		ObjectInputStream o1=new ObjectInputStream(fil);
		/*	Emp e=(Emp)o1.readObject();
		System.out.println(e.name);*/
	}

}
