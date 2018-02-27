// Base abstract class - Figure
public abstract class Figure 
{
	// Method to erase by printing empty lines
    public void erase()
    {
    	for(int i = 0; i < 10; i++)
    	{
    		System.out.println();
    	}
    }
    
    // Abstract method for draw
    // Defined in Rectangle and Triangle classes
    public abstract void draw();
    
    // Abstract method for draw
    // Defined in Rectangle and Triangle classes
    public abstract void center();
}
