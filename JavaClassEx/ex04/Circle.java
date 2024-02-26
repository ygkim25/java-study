package ex04;

public class Circle implements Shape {

	private double radius;
	private double area;
	private double circum;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void area() {
		// 넓이
		area = radius * radius * 3.14;
		System.out.printf("원의 넓이는 : %.2f \n", area);

	}

	@Override
	public void circum() {
		// 둘레
		circum = 2 * 3.14 * radius;
		System.out.printf("원의 둘레는 : %.2f \n", circum);
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getCircum() {
		return circum;
	}

	public void setCircum(double circum) {
		this.circum = circum;
	}

}
