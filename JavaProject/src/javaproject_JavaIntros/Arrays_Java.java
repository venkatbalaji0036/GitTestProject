package javaproject_JavaIntros;

import java.util.Arrays;

public class Arrays_Java {
	public static void main(String[] args) {
		/*
		 * Array declaration
		 * Array initialization
		 * Adding data into array
		 * displaying the array content
		 * Two dimensional arrays
		 */
		
		int[] Array1;
		String []Array2;
		int Array3[];
		
		int Array4[] = new int[10];
		Array1 = new int[5];
		Array2 = new String[8];
		
		int Array5[] = new int[]{10, 20, 30, 40, 50};
		Array3 = new int[]{60, 70, 30, 90, 20};
		
		Arrays.sort(Array3);
		for(int i=0;i<Array3.length;i++){
			System.out.println("Sorted value is: "+Array3[i]);
		}
		
		
		Array1[0] = 10;
		Array1[1] = 20;
		Array1[2] = 30;
		
		for(int i=0;i<Array1.length;i++){
			System.out.println(Array1[i]);
		}
		
		
		
	/*	int Array4[]= new int[]{10, 20, 30, 40, 50};
		Array1 = new int[]{10, 20, 30};
		for(int i=0;i<Array1.length;i++){
			System.out.println(Array1[i]);
		}*/
	}
}
