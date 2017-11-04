
public class StringDemo {
public static void main(String[] args) {
	String s1="hello";
	String s2="hello";
	String s3=s2.toLowerCase();//no change in esiting object then reffer scp object;
	System.out.println(s1==s3);//true
	
	String s4="helloworld";
	String s5="hello";
	String s6=s5.toLowerCase()+"world";
	System.out.println(s4==s6);
}
}
