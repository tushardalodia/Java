package conditionalStatements;

public class NestedIfElse {

	public static void main(String[] args) {
		
		int a = 12;
		int b = 18;
		int c = 19;
		int result = 0;
		
		if(a>b) {
			if(a>c) {
				 result=a;
			} else {
					result = c;
				}
			} else {
				if(b>c) {
					result = b;
				} else {
					result = c;
				}
		}
//		result = a>b? a>c?a:c: b>c? b:c;  //Nesting using ternary operator
		System.out.println("largest is " + result);
	}

}
