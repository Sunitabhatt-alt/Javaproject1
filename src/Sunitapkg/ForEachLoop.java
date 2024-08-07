package Sunitapkg;

public class ForEachLoop {

	public static void main(String[] args) {
		Object a[] = {"Selenium",1,2,3.0,"Abc"};
		// all the values of a will store in b one by one
		for(Object b : a) {
			System.out.println(b);
		}
	}

}
