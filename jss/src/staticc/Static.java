package staticc;

public class Static {

	class A {
		
		

	}

	static class B {
		
		 B() {
			
		}

	}

	
	public static void main(String[] args) {
		// Static s = new Static();

		// A ax = new A(); // Error
		
		Static s = new Static();
		
		A a =s.new A();// Required object of main class 
		
		
		

		B b = new B();
		
		

		// Can a class be static in Java ???

		// The answer is YES, we can have static class in java. In java, we have static
		// instance variables as well as static methods and also static block. Classes
		// can also be made static in Java.

		// In java, we can’t make Top level (outer) class static. Only nested classes
		// can be static.

	
		
		
	}

}
