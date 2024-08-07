package Sunitapkg;

public class TypeCastingNarrowing {

	public static void main(String[] args) {
		double b= 5.9;
		int a = (int) b; //Manual casting double to int
		System.out.println(b);
		System.out.println(a);
		
		//String to integer
		String s="10";
		int i= Integer.parseInt(s);
		System.out.println(i);
		
		//Integer to String
		int c=12;
		String str= String.valueOf(i);
		System.out.println(str.length());
	}

}
