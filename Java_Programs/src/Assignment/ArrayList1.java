package Assignment;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {

	      ArrayList<Integer>a=new ArrayList<Integer>(); 
		  System.out.println(a.isEmpty()); //true 
		  a.add(2); 
		  a.add(3);  
		  a.add(202); 
		  a.add(69);  
		  a.add(null); 
		 
		  for (Integer i : a) { 
		   System.out.println(i); 
		  } 
	}

}
