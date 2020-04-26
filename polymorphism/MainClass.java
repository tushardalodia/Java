package polymorphism;

public class MainClass {

	public static void main(String[] args) {
//		Dog d = new Dog();
//		
//		Pet p = d;
//		Animal a =d;
//		
//		d.walk();
//		p.walk();  //Run Time Polymorphism
		
		greeting(); // Compile Time Polymorphism 
		
	}
	public static void greeting() {
		System.out.println("Hi there");
	}
	public static void greeting(String s) {
		System.out.println(s);
	}
}
