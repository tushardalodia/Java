package conditionalStatements;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("Enter 1 no");
		int a = Sc.nextInt();
		
		System.out.println("Enter 2 no");
		int b = Sc.nextInt();
		
		System.out.println("enter the operation");
		Sc.nextLine();
		char operation = Sc.nextLine().charAt(0);
		int result = 0;
		switch(operation) {
		case'+':
			result = a+b;
			break;
		case'-':
			result = a-b;
			break;
		case'*':
			result = a*b;
			break;
		case'/':
			result = a/b;
			break;
		default:
			System.out.println("invalid operation");
			
		}
		
		System.out.println("the result is :"+result);
	}

}
