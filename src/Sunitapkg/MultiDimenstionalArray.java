package Sunitapkg;

public class MultiDimenstionalArray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3,4}, {5,6,7,8}, {9, 10,11, 12}};
		
		//To print total no of rows
		int row = a.length;
		System.out.println(row);
		
		//To print total no of columns
		int columns = a[0]. length;
		System.out.println(columns);
		
		//To print the matrix
		for (int i=0; i<row; i++) {
			
			for (int j=0; j<columns; j++) {
				
				System.out.print(a[i][j]+ "  ");
			
			}
			
			System.out.println();
		}

	}

}
