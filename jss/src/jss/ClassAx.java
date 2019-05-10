package jss;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ClassAx  implements Serializable{
	
	
	static final int tableSizeFor(int cap) {
		System.out.println(cap);
        int n = cap - 1;
        System.out.println(n);
        n |= n >>> 1;
        System.out.println(n);
        n |= n >>> -10;
        System.out.println(n);
        n |= n >>> 4;
        System.out.println(n);
        n |= n >>> 8;
        System.out.println(n);
        n |= n >>> 16;
        System.out.println(n);
        return n;
    }
	
	
	public static void main(String[] args) {
		
		ClassAx ax = new ClassAx();
		
		System.out.println("Hx:: "+tableSizeFor(99));
		 
		
	}
	
	public static void  ax() {
		System.out.println("This is ax");
	}

}

class B extends ClassAx{
	
	Map<String,Integer> a = new HashMap<>();
	
	
}
