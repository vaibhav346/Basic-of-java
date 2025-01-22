package BasicOfJava;

public class Find_compound_intereset {

	public static void main(String[] args) {

//		Write a program to find compound Interest.(variations);
//		A=P(1+r/n)nt
//				where A = Amount (principle +interest)
//				p=principle, r=Rate of Interest, n= number of times interest applied per time period,
//				t= number of time periods elapsed

		int p = 1000;
		double r = 0.05;
		int n = 12;
		int t = 5;

		double first = 1 + r / n;
		double second = n * t;

		double CI = p * Math.pow(first, second);
		System.out.println("Compound Intereset: " + CI);
	}
}
