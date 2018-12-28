package inteface_java;

public interface InterfaceOne extends InterfaceTwo, IntefaceThree{
	public void SameBank_Transfer();
	public void DiffBank_Transfer();
	
	public static void Disply(){
		
	}
	
	public default void Display(){
		
	}
	
}
