package BasicOfJava;

public class swapTwoVariable {

	public static void main(String[] args) {

//		Write a program to swap two variables
//		i/p:
//			num1=5;
//		    num2=6;
//		    
//		    o/p:
//		    	before swap
//		    	5
//		    	6
//		    	after swap
//		    	6
//		    	5

		int num1 = 5;
		int num2 = 6;

		System.out.println("before swap");
		System.out.println(num1);
		System.out.println(num2);
		System.out.println("after swap");
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println(num1);
		System.out.println(num2);

	}
}
