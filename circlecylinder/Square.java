public class Square extends Rectangle
{



    public Square(int side)
    {
        super(side, side);
    }

    public double incircleArea()
    {
        int radius = getLength();
        Circle inscribe = new Circle(radius);
        return inscribe.getArea();
        
    }
}