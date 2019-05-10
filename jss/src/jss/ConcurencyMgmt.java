package jss;

public class ConcurencyMgmt implements y {
	private int value;
	int x;
	int y;

	public static void main(String[] args) {
		System.out.println("HI");

		ConcurencyMgmt m = new ConcurencyMgmt();
		m.x = 4;
		m.y = 9;
		System.out.println(m.x);
		System.out.println(m.y);

		ConcurencyMgmt m1 = m;
		m1.x = 40;
		m1.y = 90;
		System.out.println(m.x);
		System.out.println(m.y);
		System.out.println(m1.x);
		System.out.println(m1.y);

		System.out.println(" Expression result (-4 + 1/2 + 2*-3 + 5.0):: ");

		System.out.println(-4 + 1 / 2 + 2 * -3 + 5.0); // (-4+0-6+5)=-5

		System.out.print("Hello,\nworld!");
		bar();
		m1.setValue(99);
		
		int c=6;
		c*=3;
		System.out.println(c++);
		System.out.println(c);

	}

	public void setValue(int i) {
		// value = i;
		// System.out.println("Value:: "+value);
		this.value = i;
		System.out.println("Value:: " + value);

	}

	public static String foo(int a, String s) {
		s = "Yellow";
		a = a + 2;
		return s + "_" + a;
	}

	public static void bar() {
		int a = 3;
		String s = "Blue";
		String x = foo(a, s);
		System.out.println("\nx=" + x + " s=" + s);
	}

}

interface x {

}

interface y extends x {

}
