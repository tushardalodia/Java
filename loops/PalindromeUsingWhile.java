package loops;

import java.util.Scanner;

public class PalindromeUsingWhile {

	public static void main(String[] args) {
		Scanner Sc  = new Scanner(System.in);
		int n = Sc.nextInt();
		int temp = n;
		int reversedNumber = 0;
		while(temp>0) {
			int lastDigit = temp%10;
			reversedNumber = reversedNumber * 10 + lastDigit;
			temp /= 10;
			}
		if(reversedNumber == n) {
			System.out.println("is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}
}
