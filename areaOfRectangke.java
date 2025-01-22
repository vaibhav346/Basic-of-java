package BasicOfJava;

public class areaOfRectangke {

	public static void main(String[] args) {

//		calculate area and perimeter of rectangle
//		input:
//			length=4;
//			breadth=10;
//		
//		output:
//			Area of rectangle is: 40
//			Perimeter of rectangel is: 28

		int length = 4;
		int breadth = 10;

		int area = length * breadth;
		System.out.println("Area of rectangle is: " + area);
		int per = 2 + (length + breadth);
		System.out.println("Perimeter of rectangle is: " + per);

	}
}
