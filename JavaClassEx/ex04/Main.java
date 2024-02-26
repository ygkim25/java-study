package ex04;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(20.5);
		Circle circle = new Circle(11.4);
		
		rectangle.area();
		rectangle.circum();
		circle.area();
		circle.circum();
	}
}
