package Sunitapkg;

public class Array1 {

	public static void main(String[] args) {
		int a[] = {1, 2,3,4,5,6,100}; //Integer type array
		String b[] = {"John", "Peter"};  // String type array
		
		System.out.println(b[0]); //John
		System.out.println(b[1]); //peter
		System.out.println(a[0]); //1
		System.out.println(a[1]); //2
		
		Object c[]= {1,2,3,4,5,"John","peter",'a','b',3>12}; //Object Array
		System.out.println(c[1]); //2
		System.out.println(c[5]); //John
		System.out.println(c[9]); //false
		

	}

}
