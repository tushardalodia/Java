package oops;

class Cat{
		boolean hasFur;
		String color, breed;
		int eyes,legs;
		
		public void walk() {
			System.out.println("cat is walking");
		}
		public void eat() {
			System.out.println("cat is eating");
		}
		public void discription() {
			System.out.println("my cat has " + legs +" legs and " +eyes+" eyes");
		}
}

public class MainClass {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat();
		cat1.legs = 3;
		cat1.eyes = 2;
		
		cat2.legs = 4;
		cat2.eyes = 2;
		cat1.discription();
		cat2.discription();

	}

}
