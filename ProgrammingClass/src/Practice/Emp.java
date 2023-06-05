package Practice;

import java.io.Serializable;

public class Emp implements Serializable {
	String name;
	double sal;
	int eid;
	public Emp(String name, double sal, int eid) {
		super();
		this.name = name;
		this.sal = sal;
		this.eid = eid;
	}
	

}
