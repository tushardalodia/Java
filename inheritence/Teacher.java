package inheritence;

public class Teacher extends Person {
	public void teach() {
		System.out.println(name + "is teaching ");
	}
	public void eat() {
		super.eat();
		System.out.println("teacter " + name + "is eating");
	}
}
