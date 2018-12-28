package inheritence_java;

import collection_Package.*;

public class inheritenceTwo extends inheritenceOne{
	public static void main(String[] args) {
		//inheritenceOne obj1 = new inheritenceOne();
		//inheritenceTwo obj2 = new 
		//List_Class obj3 = new List_Class();
		
		inheritenceTwo obj2 = new inheritenceTwo();
		Display_in_inheritenceOne();
		obj2.Display();
		int value = obj2.Instance_Variable;
		System.out.println(value);
		
		
	}
	
	public void Display()
	{
		System.out.println("This is in Display of class inheritenceTwo");
	}
	
	
	
}
