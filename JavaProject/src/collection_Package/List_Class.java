package collection_Package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class List_Class {
	public static void main(String[] args) {
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(10);
		AL.add(40);
		AL.add(90);
		AL.add(60);
		
		//AL.
		
		System.out.println(AL);
		
		System.out.println(AL.size());
		System.out.println(AL.get(0));
		
		Collections.sort(AL);
		System.out.println(AL);
		
		System.out.println("===========================================");
		
		LinkedList<Integer> LL = new LinkedList<Integer>(); 
		LL.add(30);
		LL.addAll(AL);
		LL.add(60);
		
		System.out.println(LL);
		
		System.out.println(LL.size());
		System.out.println(LL.get(0));
		
		Collections.sort(LL);
		System.out.println(LL);
		
		LL.remove(3);
		
		System.out.println(LL);
		
		LinkedList<String> LLS = new LinkedList<String>();
		
		LLS.add("Test1");
		LLS.add("Rest");
		LLS.add("Best");
		
		System.out.println(LLS);
		
		Collections.sort(LLS);
		System.out.println(LLS);
		
		System.out.println("===========================================");
		
		HashSet<Integer> HS = new HashSet<Integer>();
		HS.add(30);
		HS.add(10);
		HS.add(70);
		HS.add(50);
		HS.add(10);
		
		System.out.println(HS);
		
		System.out.println(HS.size());
		
		//Collections.sort(HS);
		
		LinkedList<Integer> LLFHS = new LinkedList<Integer>();
		
		LLFHS.addAll(HS);
		
		System.out.println(LLFHS);
		
		System.out.println("===========================================");
		
		
		//maps
		
		HashMap<Integer, String> HM = new HashMap<Integer, String>();
		HM.put(1001, "Test1");
		HM.put(1005, "Test5");
		HM.put(1003, "Test5");
		HM.put(1003, "Test9");
		HM.put(null, null);
		HM.put(1004, null);
		
		
		
		System.out.println(HM);
		
		
		
	}
	
	public void methodOne(){
		System.out.println("Test");
	}
}


































