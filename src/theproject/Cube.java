package theproject;

public class Cube extends ThreeDShape {
	
	private double side;
	
	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}
	
	public Cube(String colorcube,double side) {
		super(colorcube);
		this.side = side;
	}
	
	
	public Cube(double side) {
		super();
		this.side = side;
	}
	
	
	@Override
	public String howToDraw() {
		
		return "Side is "+side;
	}

	@Override
	public double getVolume() {
		
		return side*side*side;
	}

	@Override
	public double getArea() {
	
		return side*side*6;
	}
	
	public String edit()
	{
		return "Alaa";
	}

	@Override
	public double getPerimeter() {
		
		return side*12;
	}

	@Override
	public String toString() {
		return "Cube   [side=" + side +"," +"area=" + getArea() + ", volume=" + getVolume() + "]";
	}

}
