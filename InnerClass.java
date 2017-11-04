
public class InnerClass {

static class Inner{
	
	void m()
	{
		System.out.println("m method");
	}
}
public static void main(String[] args) {
	{
		InnerClass.Inner i=new Inner() {
			void m()
			{
				System.out.println("override");
			}
		};
		i.m();
	}
	
}
}
