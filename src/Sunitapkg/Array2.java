package Sunitapkg;

public class Array2 {

	
	static	int c[]= {22, 2, 44, 7};
		
		public static void PassingArraytoMethod() {
			int b= c[0];
			for(int i=0; i<c.length; i++) {
				if(b>=c[i]) {
					System.out.println(b);
				
				}else
				{
					System.out.println("ABCD");
				}
			}
		}
		public static void main(String[] args) {
			PassingArraytoMethod();
		}

	}


