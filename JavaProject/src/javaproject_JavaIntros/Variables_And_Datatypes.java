package javaproject_JavaIntros;

public class Variables_And_Datatypes {
	
	/*
		Local Variable
		Instance Variables
		Static variable
	*/
	
	
	int Instance_Variables =30;
	static int Static_Variable = 40;
	
	
	public static void main(String[] args) {
		
		int LVariable =90;
		
		//System.out.println(Instance_Variables);
		System.out.println(Static_Variable);
		System.out.println(LVariable);
		
		Variables_And_Datatypes VD = new Variables_And_Datatypes();
		VD.Sample_Method();
	}
	
	public void Sample_Method(){
		
		int Local_Variable = 50;
		System.out.println(Local_Variable);
		System.out.println(Instance_Variables);
		System.out.println(Static_Variable);

	}
	
	
	
	
	
}
