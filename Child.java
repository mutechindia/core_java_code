
public class Child extends Parent{
	int d=10;
	Child(int d)
	{
		this.d=d;
		
	}
	{
		System.out.println("child block");
		System.out.println(d);
	}
	/*Child()
	{
		System.out.println("child constractor");
		this.d=d;
	}
	*/int k=6;
		public static void main(String[] args) {
			{   Parent p=new Parent(10);
				Child c=new Child(10);
				
			}
		}

	}


