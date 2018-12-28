package Overloading_Overiding;

public class Overloading extends Overriding{
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.Display("Test");
		obj.Display();
	}
	
	public void Display(){
		System.out.println("In Display without parameters");
	}
	
	public void Display(int i){
		System.out.println("In Display without parameters");
	}
	
	public void Display(String j){
		System.out.println("In Display with parameter of type string "+j);
	}
	
	public void Display(int i, String j){
		System.out.println("In Display without parameters");
	}
	
	public void Display(String i, int j){
		System.out.println("In Display without parameters");
	}
	
	
	
	
	
	
}
