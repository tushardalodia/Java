package loops;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		
		int n = 1;
		do {
			 n = Sc.nextInt();
			System.out.println("n is : "+n);
		}while (n != 0);
	}

}
