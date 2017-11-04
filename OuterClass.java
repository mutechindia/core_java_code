import java.util.Scanner;

class Out {
	int i;
	String s = "name";

	Out(int i, String s) {
		this.i = i;
		this.s = s;
	}

	void m() {

		System.out.println(i);
		i++;
	}

	void m1() {
		System.out.println(i);
		i++;
	}

	void m1(int i) {
		System.out.println(i);
		i++;
	}

	static class Inner {
		int j;
		String s1;

		void m() {
			System.out.println("inner calss");
		}
	}
}

public class OuterClass {

	public static boolean isStringInteger(String number) {
		try {
			Integer.parseInt(number);
		} catch (Exception e) {
			return false;
		}
		return true;
	}

	static Test4 t4 = new Test4();

	public static void main(String[] args) {
		// TODO Auto-generated method st
		Scanner sc = new Scanner(System.in);
		int a = Integer.parseInt("777");
		Test4 tt4 = new Test4();
		String g = "gesghh" + a;
		System.out.println(g);

		Out.Inner in = new Out.Inner();
		Out o = new Out(1, "ak");
		for (int i = 0; i < 10; i++) {
			o.m1();
			o.m1();
			o.m1();
			o.m1();
			o.m1();
			o.m1();
			// o.m();
			if (true) {
				break;
				// System.out.println("i am if loo");
			}

		}
	}

}
