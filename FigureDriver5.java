/*	Course:  CS 112       		 	Days & Time: M/W 1:30pm
 *	Chapter Number: 8 			Project Number: 5-6
 *	Programmer(s):  Katherine Peng
 *	Last Modified:  2/18/18
 *	Program Title:  Figure
 *	Program Description:  The purpose of this program is to create a Figure
 *		base class and derive the classes Rectangle and Triangle from it. Figure
 *		will represent a graphics system that has various shapes.
 *
 * Algorithm:
 *	1.	Create an abstract Figure class
 *	2.	Write an abstract erase method for it
 *	3.	Write an abstract draw method for it
 *	4.	Write an abstract center method for it
 *	5.	Create a Rectangle class that extends Figure. It should have private 
 *		instance variables for height and width as well as no-arg constructors
 *		and constructors with parameters. Also write the appropriate getters
 *		and setters for each instance variable
 *	6.	Write an erase method that prints out the name of the class and 
 *		the method being called
 *	7.	Write a draw method that prints out the name of the class and 
 *		the method being called
 *	8.	Write a center method that announces center is being called and
 *		then calls the erase and draw methods
 *	9.	Create a Triangle class that extends Figure. It should have a private 
 *		instance variable for side as well as a no-arg constructor
 *		and a constructor with parameters. Also write the appropriate getter
 *		and setter for the instance variable
 *	10.	Repeat steps 6-8 for the Triangle class
 *	11.	Create a driver class to test your methods
 *	12.	Create objects for Rectangle and Triangle
 *	13.	Call the erase, draw, and center methods for your Rectangle object
 *	14.	Call the erase, draw, and center methods for your Triangle object
 *	15.	Now, modify the erase method in Figure so that it uses a for statement
 *		to print 10 blank lines
 *	16. Modify the erase methods for Rectangle and Triangle so that they call
 *		the super method
 *	17.	Modify the draw method of Rectangle by using nested for
 *		statements to print out a rectangle shape based on height and width. 
 *		Output should be an arrangement of "*" symbols. In order to make the 
 *		rectangle empty, use if-else statements to program different actions
 *		for the first and last row
 *	18.	Modify the draw method of Triangle by using nested for statements to 
 *		print an arrangement of "*" symbols. The outside loop should iterate
 *		each row and the inside loop will print as many stars as is one less 
 *		than the previous line
 */
 
public class FigureDriver5
{
	public static void main(String[] args) 
	{
		// Instantiate objects
        Figure rectangle = new Rectangle(9, 12);
        Figure triangle = new Triangle(8);
        
        // Call methods for Rectangle
        rectangle.erase();
        rectangle.draw();
        rectangle.center();
        // Why doesnt this work?
        //System.out.println(rectangle.getHeight());
        
        // Call methods for Triangle
        triangle.erase();
        triangle.draw();
        triangle.center();
        System.out.println();
    }
}