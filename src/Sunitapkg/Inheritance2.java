package Sunitapkg;

import java.util.Scanner;

public class Inheritance2 extends Inheritance1{

	int test =6;
	public static void add() {
		int i;
		System.out.println("Enter the value of i");
		Scanner sc= new Scanner(System.in);
		i= sc.nextInt();
		System.out.println("The value of i is" +i);
		
		int j;
		System.out.println("Enter the value of j");
		Scanner sc2= new Scanner(System.in);
		j= sc2.nextInt();
		System.out.println("The value of j is" +j);
		
		System.out.println(i+j);
		
		}
	
	public static void main(String[] args) {

		
		Inheritance2 I2 = new Inheritance2();
		System.out.println(I2.Roll);
		System.out.println(I2.test);
		I2.add();
		

	}

}
