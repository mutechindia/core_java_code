
public class Parent {
	int i = 1;
	{
		System.out.println(i);
		// System.out.println(j);
		m();
		System.out.println("inctance flow");
	}

	public Parent() {
		System.out.println("constractor");
	}

	public Parent(final int i) {
		System.out.println(" para constractor"+i);

	}

	void m() {
		System.out.println("instace method");
		System.out.println(j);
	}

	int j = 10;
}
