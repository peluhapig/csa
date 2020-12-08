public class Die 
{
    private int numShowing;
    private int numSides;

    
    public Die()
    {
        numSides = 6;
        roll();
    }

    public Die(int sides)
    {
        numSides = sides;
        roll();
    }

    public void roll()
    {
        numShowing =(int)((Math.random() * (numSides - 1)) + 1);
        

    }

    public int getNumDots()
    {
        return(numShowing);
    }


}
