package BasicOfJava;

public class add_Mult_div_sub_TwoNumber {

	public static void main(String[] args) {
//		Write a program to print the sum (addiontion), multiply, subtract, divide and remainder of two number
//		
//		i/p: 
//			num1=5;
//			num2=10;
//		o/p:
//			addition : 15
//			subtraction : -5
//			multiply : 50
//			divide : 0

		int num1 = 5;
		int num2 = 10;

		int sum = num1 + num2;
		System.out.println("addition : " + sum);
		int sub = num1 - num2;
		System.out.println("subtraction : " + sub);
		int mul = num1 * num2;
		System.out.println("multiply : " + mul);
		int div = num1 / num2;
		System.out.println("divide : " + div);

	}
}
