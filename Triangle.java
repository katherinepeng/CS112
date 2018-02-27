// Derived class Triangle and all its methods
// Prints an arrangement of "*" symbols in a triangular pattern

public class Triangle extends Figure
{
	private int side;
	
	/**************
     *Constructors*
     **************/
    public Triangle()
    {
    	side = 5;
    }
    public Triangle(int side)
    {
    	this.side = side;
    }
    
    /*****************
     *Getters/Setters*
     *****************/
    public int getSide()
    {
    	return side;
    }
    public void setSide(int newSide)
    {
    	side = newSide;
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
    	// for each row
    	for (int i = 1; i <= side; i++)
    	{
    		// for each column in each row
    		for (int j = 0; j <= side - i; j++)
    		{
    			System.out.print("*");
    		}
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