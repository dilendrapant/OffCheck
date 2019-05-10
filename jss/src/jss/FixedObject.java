package jss;

public class FixedObject {

	volatile private static int objCount;
	volatile private static FixedObject ins;

	public static FixedObject getObject() {

		if (objCount <= 5) {

			synchronized (FixedObject.class) {
				if (objCount <= 5) {

					ins = new FixedObject();
					objCount++;
				}

			}

		} else {
			ins = null;
		}

		return ins;
	}

	public static void main(String[] args) {
		FixedObject f1 = FixedObject.getObject();
		FixedObject f2 = FixedObject.getObject();
		FixedObject f3 = FixedObject.getObject();
		FixedObject f4 = FixedObject.getObject();
		FixedObject f5 = FixedObject.getObject();
		FixedObject f6 = FixedObject.getObject();
		FixedObject f7 = FixedObject.getObject();
		FixedObject f8 = FixedObject.getObject();
		FixedObject f9 = FixedObject.getObject();
		FixedObject f10 = FixedObject.getObject();

		System.out.println(f1 + "  ");
		System.out.println(f2 + "  ");
		System.out.println(f3 + "  ");
		System.out.println(f4 + "  ");
		System.out.println(f5 + "  ");
		System.out.println(f6 + "  ");
		System.out.println(f7 + "  ");
		System.out.println(f8 + "  ");
		System.out.println(f9 + "  ");
		System.out.println(f10 + "  ");

	}
}
