// Derived class Rectangle and all its methods
// Prints an arrangement of "*" symbols in a rectangular pattern

public class Rectangle extends Figure
{
	private int height;
	private int width;
	
	/**************
     *Constructors*
     **************/
    public Rectangle()
    {
    	height = 5;
    	width = 5;
    }
	public Rectangle(int height, int width)
	{
		this.height = height;
		this.width = width;
	}
	
	/*****************
     *Getters/Setters*
     *****************/
    public int getHeight()
    {
    	return height;
    }
    public void setHeight(int newHeight)
    {
    	height = newHeight;
    }
    public int getWidth()
    {
    	return width;
    }
    public void setWidth(int newWidth)
    {
    	width = newWidth;
    }
    
    /***************
     *Other methods*
     ***************/
	// Method to erase
	public void erase()
    {
    	super.erase();
    }
    // Method to draw
    public void draw()
    {
    	// loop for each row
    	for (int y = 1; y <= height; y++)
    	{
    		//first star of row
    		System.out.print("*");
    		
    		// for top row and bottom row
    		if (y == 1 || y == height)
    		{
    			for (int i = 1; i <= width - 2; i++)
    			{
    				System.out.print("*");
    			}
    		}
    		else
    		{
    			for (int i = 1; i <= width - 2; i++)
    			{
    				System.out.print(" ");
    			}
    		}
    		//last star
    		System.out.print("*");
    		System.out.println();
    	}
    }
    // Method to center
    public void center()
    {
    	erase();
    	draw();
   	}
}