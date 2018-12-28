package javaproject_JavaIntros;

public class Java_Arrays {
	
	/*
	 * Array declaration
	 * Array init
	 * Adding values into array
	 * Two dimentional array
	 * 
	 */
	
	public static void main(String[] args) {
		
		int Array1[];
		String[] Array2;
		int []Array3;
		
		
		Array1=new int[5];
		int []Array4 = new int[5];
		
		Array4[0] = 10;
		Array4[1] = 20;
		Array4[2] = 30;
		Array4[3] = 40;
		Array4[4] = 50;
		//Array4[5] = 60;
		
		System.out.println(Array4.length);
		
		for(int i=0;i<Array4.length;i++){
			System.out.println(Array4[i]);
		}
		
		System.out.println("=============================================");
		int Array5[] = new int[]{20, 30, 40, 50, 60};
		
		
		for(int i=0;i<Array5.length;i++){
			System.out.println(Array5[i]);
		}
		
		System.out.println("=============================================");
		
		int arr[][] = new int[2][2];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[1][0] = 30;
		arr[1][1] = 40;
		
		for(int i=0;i<2;i++){
			for(int j=0;j<2;j++){
				System.out.print(arr[i][j]);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
