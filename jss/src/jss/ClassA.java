package jss;

import java.lang.annotation.Native;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.function.Consumer;

public class ClassA {

	// public static void main(String[] args) {
	// System.out.println("::S:: ");
	// List<String> names = Arrays.asList("Dcad","Pca","Pcaa","Rag","Rak");
	// names.forEach(System.out::println);
	//
	// }

	// public static void main(String[] args) {
	//
	//
	// List<String> names = Arrays.asList("Dcad","Pca","Pcaa","Rag","Rak");
	// Consumer<String> con = new Consumer<String>(){
	//
	// @Override
	// public void accept(String t) {
	// // TODO Auto-generated method stub
	// System.out.println("H :: "+t);
	// }
	//
	// };
	//
	// names.forEach(con);
	//
	// }

	// public static void main(String[] args) {
	// List<String> names = Arrays.asList("Dcad","Pca","Pcaa","Rag","Rak");
	// Consumer<String> con = str-> System.out.println(str);
	// names.forEach(con);
	//
	// }

	
	// annonomus class 
	
	
//	public static void main(String[] args) {
//
//		MyPrint mp = new MyPrint();
//		mp.print("dil", new Parser() {
//
//			@Override
//			public String parse(String str) {
//
//				return StringParser.convert(str);
//			}
//
//		});
//	}
	
	private static final int MAXIMUM_CAPACITY = 1 << 32;
	@Native public static final int   MAX_VALUE = 0x11cffFf;
	public static void main(String[] args) {
		
		//ConcurrentHashMap<K, V>
		  
		System.out.println("MAXIMUM_CAPACITY :: "+MAXIMUM_CAPACITY);
		System.out.println("MAX_VALUE :: "+MAX_VALUE);
		
		
		MyPrint mp = new MyPrint();
		mp.print("dil",( StringParser::convert));
}
}

class MyPrint {
	public void print(String str, Parser p) {
		str=p.parse(str);
		System.out.println("Print:: " + str);
	}
}

interface Parser {
	
	String parse(String str);

}

class StringParser {

	public static String convert(String s) {
		if (s.length() <= 3) {
			s = s.toUpperCase();
		} else
			s.toLowerCase();

		return s;
	}
}


//abstract class A{
//	static void x() {
//		int a;
//	}
//	  abstract void y();
//	 A(){
//		
//	}
//	public static void main(String[] args) {
//		
//	}
//}