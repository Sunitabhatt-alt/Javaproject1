package Sunitapkg;

public class Constructor3 {
	Constructor3(){
		System.out.println("No parameter");
	}

	 Constructor3(int a){
		 System.out.println("int parameter" +a);
		 
	 }
	 
	 Constructor3(String b){
		System.out.println("String parameter" +b); 
	 }
	 
	public static void main(String[] args) {
		Constructor3 c3=new Constructor3();
		
		Constructor3 c4=new Constructor3(1);
		
		Constructor3 C4= new Constructor3("selenium");
	}

}
