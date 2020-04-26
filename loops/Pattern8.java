package loops;

import java.util.Scanner;

public class Pattern8 {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int n = Sc.nextInt();
		
		for(int j=1;j<=n;j++) {
			for(int i=1;i<=j;i++) {
				
				System.out.print("* ");
			}
			System.out.println("");
			}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("* ");
			}
			System.out.println();
	}
	}
}
