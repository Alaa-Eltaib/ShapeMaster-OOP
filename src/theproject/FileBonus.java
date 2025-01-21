package theproject;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
public class FileBonus {
public static void main(String[] args)  {
		
	String inputFile = "C:\\Users\\alaam\\eclipse-workspace\\theproject\\src\\theproject\\Input.txt";
		String outputFile = "C:\\Users\\alaam\\eclipse-workspace\\theproject\\src\\theproject\\Output.txt";
		
		try ( BufferedReader Readerinput = new BufferedReader( new FileReader(inputFile));PrintWriter write = ( new PrintWriter(outputFile)) ) {
			String line = Readerinput.readLine();
			if(line==null||line.isBlank())
			{
				write.write("Error: Input file is empty or invalid.") ;
				return;
			}
			
		
		
		String[] words = line.split(" ");
		int size;
		try {
		    size = Integer.parseInt(words[0]);
		} catch (NumberFormatException e) {
			write.println("Error: First value must be an integer (size).");
		    return;
		}
		
		if (words.length<3||words.length%2!=1)
		{
			write.print("ERROR,please enter DrawableTest size shape dimension");
				
		return;
		}
		
		
		
		
		
		Drawable[]Draw=new Drawable[size];
		
		for(int i=1,j = 0; i < words.length; i += 2, j++)
			
		{
 
			
			String shapeName=words[i];
			double dimension;
			
			
			try{
				dimension=Double.parseDouble(words[i+1]);			
			}
			catch(NumberFormatException e)
			{
				write.print("Error dimension must be number ");
				 return;
			}
			
			 if (dimension <= 0) {
				 write.print("Error: Dimension must be positive for shape " + shapeName);
                 return;
             }
			
			
		
			if(shapeName.equalsIgnoreCase("Circle"))
			{
				Draw[j]=new Circle(dimension);
			}
			
			else if(shapeName.equalsIgnoreCase("Cube"))
			{
				Draw[j]=new Cube(dimension);
			}
			else {
				write.print("Wrong Shape Name"+shapeName);
				return;
			}
			
		}
		
		
			double totalArea=0.0;
			
			for(Drawable drawable:Draw)
			{
				if (drawable == null) {
					write.print("Error: Drawable object is null.");
				    return;
				}

				totalArea+=((Shape)drawable).getArea();
				
				write.println(drawable.toString()) ;
				 
				}
			
			write.print("The Total Area = "+totalArea);
		}
		
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}


}
