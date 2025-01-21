package theproject;

public class Circle extends Shape {

	private double radius;
	
	
	public Circle(String colorCircle,double raduis) {
		super(colorCircle);
		this.radius=radius;
		
	}

	public Circle(double raduis) {
		this.radius=raduis;
		
	}

	public String edit()
	{
		return "Alaa";
	}
	
	public double getRaduis() {
		return radius;
	}

	public void setRaduis(double raduis) {
		this.radius = raduis;
	}

	@Override
	public String howToDraw() {
		// TODO Auto-generated method stub
		return "Raduis is "+radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius*radius*Math.PI;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return radius*2*Math.PI;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius +"," +"area=" + getArea() + "]";
	}
	
	
	

}
