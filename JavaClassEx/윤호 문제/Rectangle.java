package ex04;

public class Rectangle implements Shape{

	private double length;
	private double area;
	private double circum;
	public Rectangle(double length) {
		this.length = length;
	}
	@Override
	public void area() {
//		넓이
		area = length* length;
		System.out.printf("사각형의 넓이는 : %.2f \n", area);
	}

	@Override
	public void circum() {
//		둘레
		circum = length*4;
		System.out.printf("사각형의 둘레는 : %.2f \n", circum);
		
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
