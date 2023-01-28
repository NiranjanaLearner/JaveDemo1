package Packageuesd1;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(10+20);
		System.out.println(10+"20");
		System.out.println("10"+"20");
		System.out.println("10"+20);
		int a=6;
		System.out.println(++a);
		int b=8;
		System.out.println(b++);
		System.out.println(b);
		increment_op();
		logicaloperator1();
		logicaloprator2();
		
	}
	
	
public static void increment_op() 
{
	
	System.out.println(10+20);
	System.out.println(10+"20");
	System.out.println("10"+"20");
	System.out.println("10"+20);
	
}

public static void logicaloperator1()
{
	
int a=10;
int b=15;
System.out.println("value of a:" +a);
System.out.println(a<b);
System.out.println(a>b);
System.out.println(a<=b);
System.out.println(a>=b);

}
public static void logicaloprator2()
{
//&& operator
System.out.println((5 > 3) && (8 > 5));  // true
System.out.println((5 > 3) && (8 < 5));  // false

// || operator
System.out.println((5 < 3) || (8 > 5));  // true
System.out.println((5 > 3) || (8 < 5));  // true
System.out.println((5 < 3) || (8 < 5));  // false

// ! operator
System.out.println(!(5 == 3));  // true
System.out.println(!(5 > 3));  // false
}
}
