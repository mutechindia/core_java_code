import java.util.Scanner;

class c {
	c()
	{
		
	}
	c(int k)
	{}
	 static void m1() {
		System.out.println("static m1 method");
	}

	static void m() {
		System.out.println("m method");
	}
}

public class HideDemo extends c {
	public HideDemo() {
	
	}
	HideDemo(int k) {
		super(k);
	}

	static void m() {
		System.out.println("hideclass method");
	}

	 static void m1() {
		System.out.println("hide class static method");
	}
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
	c r=new c();
	    r.m();
     
	}
}
