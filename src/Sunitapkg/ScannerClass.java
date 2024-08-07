package Sunitapkg;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		int a;
		float b;
		String s;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		s =sc.nextLine();
		System.out.println("you are entered string" +s);
		
		System.out.println("Enter a interger");
		a = sc.nextInt();
		System.out.println("you are entered string" +a);
		
		System.out.println("Enter a Float");
		b = sc.nextFloat();
		System.out.println("you are entered string" +b);
	}

}
