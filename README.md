# ShapeMaster-OOP

ShapeMaster-OOP is a Java-based project designed to represent 2D and 3D geometric shapes (such as circles and cubes) and calculate their properties, including area, perimeter, and volume. as well as reading and processing data from a text file.

---

## Features

- 2D Shapes: Support for shapes like circles.
- 3D Shapes: Support for shapes like cubes.
- Calculations: Calculate area, perimeter, and volume.
- File I/O: Read shape data from a text file and write results to another file.

---

## How to Use

### Running DrawableTest
1. Provide input via the command line:
   ```bash
   java theproject.DrawableTest 2 Circle 5 Cube 3
Running FileBonus
Add shape data to Input.txt:
plaintext
Copy
Edit
2 Circle 5 Cube 3
Run the FileBonus class:


java theproject.FileBonus
The results will be saved in Output.txt.


## FileBonus Details

The FileBonus class reads shape data from Input.txt, processes it, and writes the results to Output.txt. Here’s how it works:

### Input Format
- The first value in Input.txt is the number of shapes.
- Each shape is represented by its name and dimension.

Example Input:
2 Circle 5 Cube 3
2: Number of shapes.

Circle 5: A circle with a radius of 5.

Cube 3: A cube with a side length of 3.


## Output
The program calculates the area of each shape and writes the results to Output.txt.

Example Output:  
Circle [radius=5.0, area=78.53981633974483].  
Cube [side=3.0, area=54.0, volume=27.0].  
The Total Area = 132.5398163397448'.
## Technologies Used
- Java: The primary programming language used in the project.
- Object-Oriented Programming (OOP): The project is designed using OOP principles.
- Interfaces and Abstract Classes: Used to define common behaviors for shapes.
- File I/O (Input/Output): Used to read from and write to text files.
