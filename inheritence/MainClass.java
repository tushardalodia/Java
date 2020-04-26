package inheritence;

public class MainClass {

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "Harry ";
		t.eat();
		
		t.teach();
		
		Singer s = new Singer();
		s.name = "potter ";
		s.sing();
		s.eat();

	}

}
