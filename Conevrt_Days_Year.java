package BasicOfJava;

public class Conevrt_Days_Year {

	public static void main(String[] args) {

//		Write a program to convert days into year weeks and days
//		i/p:
//			373
//			o/p:
//				year : 1
//				month : 0
//				weeks : 1
//				days : 1

		int num = 373;

		int year = num / 365;
		System.out.println("year : " + year);
		int rem = num % 365;

		int month = rem / 30;
		System.out.println("month : " + month);
		int rem1 = rem % 30;

		int weeks = rem1 / 7;
		System.out.println("weeks : " + weeks);

		int days = rem1 % 7;
		System.out.println("days : " + days);
	}
}
