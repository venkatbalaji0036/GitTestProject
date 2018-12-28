package javaproject_JavaIntros;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Strings_Date_Conversions {
	public static void main(String[] args) {
		/*
		 * Strings
		 * Conversions and 
		 * Date operations
		 */
		
		int i=10;
		String value = "Test";
		int j=20;
		
		String k = Integer.toString(i)+Integer.toString(j);
		System.out.println(k);
		
		int l = Integer.parseInt(k);
		System.out.println(l+80);
		
		
		//LocalDate
		//LocalTime
		//LocalDateTime
		
		
		LocalDate Date = LocalDate.now();
		LocalTime Time = LocalTime.now();
		LocalDateTime DateTime = LocalDateTime.now();
		
		System.out.println(Date+" "+Time+" "+DateTime);
		
		
		String str = new String();
		str = "This is my first String in standard format";
		
		
		
		
		
		
	}
}




















