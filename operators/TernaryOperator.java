package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		int a = 12;
		int b = 18;
		int c = 19;
		int result = 0;
		
		result = a>b? a>c?a:c: b>c? b:c;  
		System.out.println("largest is " + result);

	}

}
