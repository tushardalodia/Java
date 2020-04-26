package oops;

class Vehicle {

	int wheels;
	int headLights;
	String color;
	Vehicle(int Wheels) { //It is a parameterized constructor and when Vehicle() is empty then it is a no argument constructor.
		this.wheels = Wheels;
		headLights = 2;
	}
	Vehicle(int wheels, String color){ //this is called constructor overloading.
		this.wheels = wheels;
		this.color = color;
		headLights = 2;
	}
}
public class MyConstructor {
	MyConstructor(){
		System.out.println("object is created");
	}


	public static void main(String[] args) {
		
//		MyConstructor obj = new MyConstructor();
		Vehicle car = new Vehicle(4);
		Vehicle bike = new Vehicle(2);
		Vehicle rikshaw = new Vehicle(3, "Yellow");
		System.out.println(rikshaw.wheels +" wheels and color ="+ rikshaw.color);
		

	
}
}
