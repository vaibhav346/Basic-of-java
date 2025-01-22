package BasicOfJava;

public class totalMarksAndAverageOfSubjects {

	public static void main(String[] args) {

//		Write a program to dispaly total Marks average of subjects
//		i/p:
//			int mar=52;
//			int hindi=46
//			int eng=45;
//			int math=76;
//			int chem=73;
//			int subcnt=5;
//		
//		o/p :
//			total marks : 292
//			avg of sub : 58

		int mar = 52;
		int hindi = 46;
		int eng = 45;
		int math = 76;
		int chem = 73;
		int subcnt = 5;

		int sum = mar + hindi + eng + math + chem;
		System.out.println("total marks : " + sum);
		int avg = sum / subcnt;
		System.out.println("avg of sub : " + avg);

	}
}
