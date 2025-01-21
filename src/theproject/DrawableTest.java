package theproject;

public class DrawableTest {

	public static void main(String[] args) {
		if (args.length<3||args.length%2!=1)
		{
				System.out.println("ERORR,please enter DrawableTest size shape dimension  ");
				
		return;
		}
		

		int size=Integer.parseInt(args[0]);
		
		
		Drawable[]Draw=new Drawable[size];
		
		for(int i=1,j = 0; i < args.length; i += 2, j++)
		{
			String shapeName=args[i];
			double dimension=Double.parseDouble(args[i+1]);
			
		
			if(shapeName.equalsIgnoreCase("Circle"))
			{
				Draw[j]=new Circle(dimension);
			}
			
			else if(shapeName.equalsIgnoreCase("Cube"))
			{
				Draw[j]=new Cube(dimension);
			}
			else {
				System.out.println("Wrong Shape");
				return;
			}
			
		}
		
		
		
		double totalArea=0.0;
		
		for(Drawable drawable:Draw)
		{
			totalArea+=((Shape)drawable).getArea();
			 System.out.println(drawable);
			 System.out.println( drawable.edit());
			
		}
		
		System.out.println("The Total Area = "+totalArea);
	}	

	}


