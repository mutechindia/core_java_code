public class IncreDecreDemo {
	public static void star() 
	{
	 int i, j, k;
	for(i=5;i>=1;i--)
	{
	for(j=5;j>i;j--)
	{
	System.out.print(" ");
	}
	for(k=1;k<(i*2);k++)
	{
	System.out.print("*");
	}
	System.out.println();
	}
	}
	public static void main(String[] args) {
		IncreDecreDemo.star();
		int i,j,k;
		for(i=1; i<=5; i++)
		{
		for(j=4; j>=i; j--)
		{
		System.out.print(" ");
		}
		for(k=1; k<=(2*i-1); k++)
		{
		System.out.print("*");
		}
		System.out.println("");
		}
     IncreDecreDemo.star();
     char ch;
     
     for( ch = 'a' ; ch <= 'z' ; ch++ )
        System.out.println(ch);
		}
	}

