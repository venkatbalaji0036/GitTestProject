package selenium_Path_Identification;

import java.util.LinkedHashSet;
import java.util.Set;

public class Programms {
	public static void main(String[] args) {
		Programms obj = new Programms();
		//obj.Remove_Duplicates();
		//obj.Max_Count();
		//obj.getSmallestIntegerPosition();
		//obj.Nth_Con_Occurence();
		obj.Middle_Char();
		
	}
	
	private void Middle_Char() {
		String Val ="abcdefghijkl";
		
		int midpostition = Val.length()/2;
		
		if(Val.length()%2!=0){
			System.out.println("Middle char is: "+Val.charAt(midpostition));
		}else{
			System.out.println("Middle char is: "+Val.charAt(midpostition-1)+" and "+Val.charAt(midpostition));
		}
	}

	private void Nth_Con_Occurence() {
		String Val = "Amazon is a great company as it haas AtoooZzz";
		int counter=0, OrgVal=0;
		char Val1 = '\0';
		char[] ArrayVal = Val.toCharArray();
		for(int i=0;i<ArrayVal.length;i++){
			for(int j=i+1;j<ArrayVal.length;j++){
				if(ArrayVal[i]==ArrayVal[j]){
					if(ArrayVal[i]==Val1){
						continue;
					}else{
						counter = counter+1;
						Val1=ArrayVal[i];
					}
				}else{
					break;
				}
				if(OrgVal<counter){
					OrgVal=counter;
				}else{
					continue;
				}
			}
		}
		System.out.println("=============================");
		System.out.println("Counter is:"+counter+" Value is:"+Val1);
	}


	private void Max_Count() {
		// TODO Auto-generated method stub
		
	}



	private void getSmallestIntegerPosition() {
		int SmallestInteger = 0;
		boolean flag=true;
		int[] ArrayVal = new int[]{4,6,7,2};
		for(int i=0;i<ArrayVal.length;i++){
			for(int j=i+1;j<ArrayVal.length;j++){
				if(ArrayVal[i]<ArrayVal[j]){
					if(ArrayVal[i]<SmallestInteger||flag){
						SmallestInteger = ArrayVal[i];
						System.out.println("Index Value ishjkgkjgkhj: "+i);
						flag=false;
					}else{
						continue;
					}
				}else if(ArrayVal[j]<SmallestInteger){
					SmallestInteger=ArrayVal[j];
					System.out.println("Index Value is: "+j);
				}else{
					continue;
				}
			}
		}
		System.out.println(SmallestInteger);
	}



	public void Remove_Duplicates(){
		String Val = " i/p call taxi o/p: cal taxi 3.";
		Set<Character> SetVal = new LinkedHashSet<Character>();
		int Size = Val.length();
		char[] Character = Val.toCharArray();
		for(int i=0;i<Size;i++){
			SetVal.add(Character[i]);
		}
		System.out.println(SetVal);
		
		
		StringBuffer sb = new StringBuffer();
		for(char character : SetVal){
			sb.append(character);
		}
		String value = sb.toString();
		System.out.println(value);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
