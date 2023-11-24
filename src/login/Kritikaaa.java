package login;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Kritikaaa {

	public static void main(String[] args) {
Map <Integer,String>m=new LinkedHashMap<>();
		
		//to add the values
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "sql");
		m.put(40, "selenium");
		m.put(50, "python");
		m.put(10, "c");
		
		System.out.println(m);
		//to find the size
		int size = m.size();
		System.out.println(size);
		
		//to get the particular value
		m.get(40);
		System.out.println(m);
		
		//to display the key only
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		//to display the value only
		Collection<String> values = m.values();
		System.out.println(values);
		
		//to remove particular key
		 m.remove(10);
		 System.out.println(m);
		 
		 //iteratin
		 Set<Entry<Integer, String>> entrySet = m.entrySet();
		 System.out.println(entrySet);
		 
		 System.out.println("  ");
		 
		 for(Entry<Integer, String>X:entrySet) {
			 System.out.println(X);
			 System.out.println(X.getKey());
			 System.out.println(X.getValue());
		 }
		 

	}

}
