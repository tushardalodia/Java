package arrays;
import java.util.Scanner;
public class AverageMarksOfStudents {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter the no of students : ");
		int n = Sc.nextInt();
		
		int[] marks = new int[n];
		System.out.println("enter the marks");
		for(int i=0;i<n;i++) {
			marks[i]= Sc.nextInt();
		}
		int averageMarks = 0;
		for(int i = 0; i<n;i++) {
			averageMarks += marks[i];
			
		}
		averageMarks /= n;
		System.out.println("the average marks are : " + averageMarks);
	}

}
