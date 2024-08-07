package Sunitapkg;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<Object> obj = new ArrayList<Object>();
		 obj.add(1);
		 obj.add("Selenium");
		 obj.add("Java");
		 obj.add(34);
		 obj.add(3.0);
		 
		 // 1st way
		 System.out.println(obj);
		 
		  //2nd way
		 for(Object abc:obj) {
			 System.out.println(abc);
		 }
		 
		 //3rd way
		 
		 Iterator bcd = obj.iterator();
		 while(bcd.hasNext()) {
			 System.out.println("while loop:-" +bcd.next());
		 }
		

	}

}
