package userInput;
import java.util.Scanner;
public class ScannerUserInput {

	public static void main(String[] args) {
//		Scanner Sc= new Scanner(System.in);
//		int x= Sc.nextInt();
//		double y= Sc.nextDouble();
//		String hello = Sc.nextLine();	
//		System.out.println(hello);
		Scanner Sc = new Scanner(System.in);
        int principal = Sc.nextInt();
        float rate = Sc.nextFloat();
        int time = Sc.nextInt();
        float simpleInterest = principal * rate * time / 100;
        System.out.println("SI is :" + simpleInterest);
	}

}
