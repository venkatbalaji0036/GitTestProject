package javaproject_JavaIntros;

public class ControlStatements_java {
	public static void main(String[] args) {
		/*
		 * For loop
		 * if condition
		 * if else
		 * if else if
		 * Switch
		 * while
		 * do while
		 * 
		 */
		
		
		int USA = 1, UK = 44, Australia = 63, India = 91;
		int Reference_Value=44;
		int Reference_Value1=44;
		
		
		for(int Start_Point = 0; Start_Point<=20;Start_Point+=2){
			System.out.println(Start_Point);
		}
		
		for(Reference_Value=USA;Reference_Value<=100;Reference_Value++){
			if(Reference_Value==63){
				System.out.println("This is the country code of Australia "+Reference_Value);
				break;
			}else if(Reference_Value==91){
				System.out.println("This is the country code of India "+Reference_Value);
			}else{
				System.out.println("Other Country");
				
			}
		}
		
		System.out.println("==========================================================================");
		
		//System.out.println(Reference_Value);
		
		switch(Reference_Value1){
		case 1:
			System.out.println("This is the country code of USA");
			break;
		
		case 44:
			System.out.println("This is the country code of UK");
			break;
		
		case 63:
			System.out.println("This is the country code of Autralia");
			break;
			
		case 91:
			System.out.println("This is the country code of India");
			break;
			
		default:
			System.out.println("This is not related to any of the country we have");
			break;
		}
		
		System.out.println("===============================================================");
		
		int Reference_Value2=0;
		
		
		while(Reference_Value2<=91){
			if(Reference_Value2==63){
				System.out.println("This is the country code of Australia "+Reference_Value);
				//break;
			}else if(Reference_Value2==91){
				System.out.println("This is the country code of India "+Reference_Value);
			}else{
				System.out.println("Other Country");
			}
			
			Reference_Value2+=1;
			//Reference_Value2 = Reference_Value2+1;
		}
		
		
		System.out.println(Reference_Value);
	//	System.out.println(Reference_Value2);
		
		
/*	System.out.println("===============================================");	
		int Reference_Value3 = 0;
	
		do{
			if(Reference_Value3==63){
				System.out.println("This is the country code of Australia "+Reference_Value3);
				//break;
			}else if(Reference_Value3==91){
				System.out.println("This is the country code of India "+Reference_Value3);
			}else{
				System.out.println("Other Country");
			}
			
			Reference_Value3 = Reference_Value3+1;
		}while(Reference_Value3<=100);
		
		
		
		*/
		
		
		
		
	}
}
