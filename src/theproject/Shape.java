package theproject;

import java.util.Date;

public abstract class Shape implements Drawable  {

	private Date dateCreated ;
	private String color;
	
	public Date getDateCreated() {
		return dateCreated;
	}
	

	public Shape() {
		super();
		this.dateCreated = new Date();
		this.color =color;
	}
	
	
	public Shape(String color) {
		super();
		this.color = color;
	}




	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public abstract  double getArea();
	public abstract  double getPerimeter();
	
	
	@Override
    public String howToDraw() {
        return "Draw the shape";
    }
	
	
}
