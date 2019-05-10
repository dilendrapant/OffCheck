package jss.j8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Mx {
	int x, y;

}

class C1 {
	int a, b;
	Mx e = new Mx();

}

public class M1 {

	int z;

	M1() {
		z = 44;
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException,
			SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException,
			FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("Object of C1:: ");

		C1 c1 = new C1();
		c1.a = 1;
		c1.b = 2;
		c1.e.x = 3;
		c1.e.y = 4;

		System.out.println(" a: " + c1.a + " b: " + c1.b + " x: " + c1.e.x + " y: " + c1.e.y);
		C1 c2 = c1;
		c2.e.x = 100;
		System.out.println(" a: " + c2.a + " b: " + c2.b + " x: " + c2.e.x + " y: " + c2.e.y);

		M1 m = M1.class.newInstance();
		System.out.println(m.z);

		// Object

		ObjectOutputStream m5 = new ObjectOutputStream(new FileOutputStream("D:\\out"));
		m5.writeObject(m);
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\out"));
			M1 m6 = (M1) in.readObject();
			
			System.out.println("HI "+m6.z);

		// Constructor
		Constructor<M1> m2 = M1.class.getConstructor();
		M1 m3 = m2.newInstance();
		m3.z = 444;
		M1 m4 = (M1) m3.clone();

		System.out.println(m4.z);

	}
}