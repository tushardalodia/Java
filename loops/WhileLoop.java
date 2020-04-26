package loops;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		int temp = n;
		int sum = 0;
		while(temp > 0) {
			int lastdigit = temp % 10;
			temp /= 10;
			sum+= lastdigit;
		}
		System.out.println("the sum of digits of"+n+"is"+sum);
	}

}
