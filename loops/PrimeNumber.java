package loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		boolean isPrime = true;
		for(int i = 2; i<n; i++) {
			if(n%i==0) {
				isPrime = false;
				break;
			}
		}
			if(n<2) isPrime = false;
			System.out.println("isPrime"+isPrime);
	}

}
