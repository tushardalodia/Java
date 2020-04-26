package interfaces;

public class Person implements Student, YouTuber {

	public static void main(String[] args) {
		Person obj = new Person();
		obj.study();
		obj.makeVideo();

	}

	@Override
	public void study() {
		System.out.println("person is studying");
		
	}

	@Override
	public void makeVideo() {
		System.out.println("person is making video");
		
	}

}
