package loops;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int a = Sc.nextInt();
		int b = Sc.nextInt();
		int result = 1;
		for(int i = 0; i<b; i++) {
			result *= a;
		}
		System.out.println(result);
	}

}
