package Sunitapkg;

public class StringDiff {

	public static void main(String[] args) {
		String str1 ="Silent";
		String str2 ="Listen";
		
	   int LOS1 = str1.length();
	   int LOS2 = str2.length();
	   System.out.println(LOS1);
	   System.out.println(LOS2);
	   
	 int diff = LOS1 - LOS2;
	 System.out.println(diff);
	}

}
