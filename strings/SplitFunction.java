package strings;

public class SplitFunction {

	public static void main(String[] args) {
		String cars = "BMW,RangeRover,lamborghini,jaguar,ferrari";
		String allcars[] = cars.split(",");
		
		for(String car: allcars) {
			System.out.println(car);
		}

	}

}
