package Packageuesd1;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;//it is know to code within main method
		x=10;
		if(x==10)
		{
			int y=20;//y is know to this block we cannot acess outside the if block
			
		}
	//	y=30;
		System.out.println("value of x"+x);
	}
	

}
