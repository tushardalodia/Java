package arrays;

import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter dimention : ");
		int rows = Sc.nextInt();
		int cols = Sc.nextInt();
		
		int a[][] = new int[rows][cols];
		int b[][] = new int[rows][cols];
		
		System.out.println("enter array a : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j] = Sc.nextInt();
			}
		}
		System.out.println("enter array b : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				b[i][j] = Sc.nextInt();
			}
		}
		int c[][] = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
			}
		System.out.println("result array c is : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(c[i][j] +" ");
			}
			}
	}

}
