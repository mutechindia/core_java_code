
public class EqualDoubleEquals {

	public static void main(String[] args) {
		String s1=new String("gourav");
		String s2=new String("gourav");
		StringBuffer sb1=new StringBuffer("gourav");
		StringBuffer sb2=new StringBuffer("gourav");
		StringBuilder sbr1=new StringBuilder("gourav");
		StringBuilder sbr2=new StringBuilder("gourav");
		Integer i1=new Integer(10);
		Integer i2=new Integer(10);
		
		System.out.println(i1.equals(i2));
		System.out.println(s1.equals(s2));
		System.out.println(sb1.equals(sb2));
		System.out.println(sbr1.equals(sbr2));
		System.out.println(sb1==sb2);
		System.out.println(s1==s2);
		System.out.println(i1==i2);
		
		System.out.println(null==null);
		String s3=null;
		System.out.println(s3==null);
		
		
	}

}
