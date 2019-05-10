package jss;
//
//import java.util.HashMap;
//import java.util.Map;
//
//class Geek  
//	{ 
//	      
//	    String name; 
//	    int id; 
//	      
//	    Geek(String name, int id) 
//	    { 
//	          
//	        this.name = name; 
//	        this.id = id; 
//	    } 
//	      
//	    @Override
//	    public boolean equals(Object obj) 
//	    { 
//	          
//	    // if both the object references are  
//	    // referring to the same object. 
//	    if(this == obj) 
//	            return true; 
//	          
//	        // it checks if the argument is of the  
//	        // type Geek by comparing the classes  
//	        // of the passed argument and this object. 
//	        // if(!(obj instanceof Geek)) return false; ---> avoid. 
//	        if(obj == null || obj.getClass()!= this.getClass()) 
//	            return false; 
//	          
//	        // type casting of the argument.  
//	        Geek geek = (Geek) obj; 
//	          
//	        // comparing the state of argument with  
//	        // the state of 'this' Object. 
//	        return (geek.name.equals(this.name)  && geek.id == this.id); 
//	    } 
//	    
//	      
//	    @Override
//		public String toString() {
//			return "Geek [name=" + name + ", id=" + id+ "]";
//		}
//
//		@Override
//	    public int hashCode() 
//	    { 
//	          
//	        // We are returning the Geek_id  
//	        // as a hashcode value. 
//	        // we can also return some  
//	        // other calculated value or may 
//	        // be memory address of the  
//	        // Object on which it is invoked.  
//	        // it depends on how you implement  
//	        // hashCode() method. 
//	        return this.id; 
//	    } 
//	      
//	} 
//	  
//	// Driver code 
//	class Performance1  
//	{ 
//	    public static void main1 (String[] args)  
//	    { 
//	          
//	        // creating two Objects with  
//	        // same state 
//	        Geek g1 = new Geek("aditya", 1); 
//	        Geek g2 = new Geek("aditya", 1); 
//	        Geek g3 = new Geek("aditya", 1); 
//	        Geek g4 = new Geek("aditya", 1); 
//	          
//	        Map<Geek, String> map = new HashMap<Geek, String>(); 
//	        map.put(g1, "CSE"); 
//	        map.put(g2, "IT"); 
//	        map.put(g3, "CSE2"); 
//	        map.put(g4, "IT2");
//	          
//	 
//	        for(Geek geek : map.keySet()) 
//	        { 
//	        	System.out.println(geek);
//	            System.out.println(map.get(geek).toString()); 
//	        } 
//	        //String [] arg = new String[2];
//	        Performance a = new Performance();
//	        Performance a1 = new Performance();
//	        args[0] = "hello";
//	        args[1] = "every";
//	        for(int i = 0; i < args.length; i++) {
//	            System.out.println(args[i]);
//	        }
//	  
//	    } 
//	}
//	
//	class P{
//		public void px(float a) {
//			System.out.println("This is from px .."+a);
//		}
//	}
//	class Performance extends P{
//		public int  px(int a) {
//			System.out.println("This is from px ..:: "+a);
//			return a;
//		}
//		public static void main(String args[]) {
//			Performance p = new Performance();
//			p.px(5);
//			
//			
//		}
//	}
//	
class Base {
	 private static void display() {
		System.out.println("Static or class method from Base");
	}

	public void print() {
		System.out.println("Non-static or instance method from Base");
	}
}

class Derived extends Base {
	private static void display() {
		System.out.println("Static or class method from Derived");
	}

	public void print() {
		System.out.println("Non-static or instance method from Derived");
	}
}

public class Performance {
public static void main(String args[])
{
	
Base obj= new Derived();

//obj.display();
obj.print();
}
}
