package javaproject_JavaIntros;

import org.openqa.jetty.http.SSORealm;

public class Java_Operators {
	public static void main(String[] args) {
		
		
		
		int a= 10, b=-20, c=30, d=-40, e=-50, f=60, g=-70, h=80;
		
		System.out.println(a++);
		System.out.println(b--);
		System.out.println(--c);
		System.out.println(++d);
		System.out.println(+e);
		System.out.println(-f);
		System.out.println(~g);
		
		System.out.println("============================================");
		
		int i = 10, j=20;
		int k, l;
		boolean m = false;
		
		System.out.println(10+20);
		System.out.println(10-20);
		System.out.println(10*20);
		System.out.println(20/10);
		System.out.println(20%10);
		
		System.out.println("===============================================");
		
		//shift operator
		
		
		//System.out.println(10>>3);
		
		int x=100;
		int y=20;
		
		if(x==10 || y==200){
			System.out.println("This is in AND operator");
			
		}
		System.out.println("==========Ternary operator==========================");
		int w = (x<y)?x:y;
		System.out.println(w);
		
		
		
	}
}
























