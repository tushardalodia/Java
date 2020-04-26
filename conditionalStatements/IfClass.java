package conditionalStatements;
import java.util.Scanner;
public class IfClass {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int number = Sc.nextInt();
		
		if(number<=10) {
			System.out.println("number is less than 10");
		}
		else if(number>10 && number<=22){System.out.println("number is greater then 10 and less than 22");
		
		} else if(number>20 && number<=30) {
			System.out.println("number is greater than 20 and less than 30");
		} else {
			System.out.println("greater");
		}
	
	}

}
