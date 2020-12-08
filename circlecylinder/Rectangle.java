public class Rectangle
{
  //fields
  private int length, width;

  //constructor
  public Rectangle(int len, int w)
  {
    length = len;
    width = w;
  }

  //accessor methods
  public int getLength()
  {
    return length;
  }
  public int getWidth()
  {
    return width;
  }

  //other methods
  public int getArea()
  {
    return length*width;
  }

  public int getPerimeter()
  {
    return 2*(length + width);
  }
}